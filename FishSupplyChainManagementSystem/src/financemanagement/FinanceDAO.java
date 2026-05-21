
package financemanagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FinanceDAO
{
    
        Connection connect() throws Exception
    {
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System",
            "postgres",
            "sumai123"
        );
    }

    //  DATE-WISE DATA
    public List<FinanceModel> getFinanceData(String start, String end) throws Exception
    {
        List<FinanceModel> list = new ArrayList<>();

        String sql = """
            SELECT d::date AS date,
                   COALESCE(s.total_sales,0) AS total_sales,
                   COALESCE(e.total_expense,0) AS total_expense
            FROM generate_series(?::date, ?::date, '1 day') d
            LEFT JOIN (
                SELECT order_date, SUM(total_price) total_sales
                FROM sales GROUP BY order_date
            ) s ON d = s.order_date
            LEFT JOIN (
                SELECT expense_date, SUM(amount) total_expense
                FROM expense GROUP BY expense_date
            ) e ON d = e.expense_date
            ORDER BY d
        """;

        PreparedStatement ps = connect().prepareStatement(sql);
        ps.setString(1, start);
        ps.setString(2, end);

        ResultSet rs = ps.executeQuery();

        while (rs.next())
        {
            double sales = rs.getDouble("total_sales");
            double expense = rs.getDouble("total_expense");

            list.add(new FinanceModel(
                rs.getDate("date").toString(),
                "Daily Summary",
                sales,
                expense,
                sales - expense
            ));
        }

        return list;
    }

    // TOTAL SALES
    public double getTotalSales(String start, String end) throws Exception
    {
        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT COALESCE(SUM(total_price),0) FROM sales WHERE order_date BETWEEN '" + start + "' AND '" + end + "'"
        );
        return rs.next() ? rs.getDouble(1) : 0;
    }

    // TOTAL EXPENSES
    public double getTotalExpenses(String start, String end) throws Exception
    {
        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT COALESCE(SUM(amount),0) FROM expense WHERE expense_date BETWEEN '" + start + "' AND '" + end + "'"
        );
        return rs.next() ? rs.getDouble(1) : 0;
    }

    // LAST 30 DAYS SALES
    public double getLastMonthSales() throws Exception
    {
        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT COALESCE(SUM(total_price),0) FROM sales WHERE order_date >= CURRENT_DATE - INTERVAL '30 days'"
        );
        return rs.next() ? rs.getDouble(1) : 0;
    }

    // LAST 30 DAYS EXPENSES
    public double getLastMonthExpenses() throws Exception
    {
        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT COALESCE(SUM(amount),0) FROM expense WHERE expense_date >= CURRENT_DATE - INTERVAL '30 days'"
        );
        return rs.next() ? rs.getDouble(1) : 0;
    }
    
}
