
package AdminMenu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO
{
    
        Connection connect() throws Exception
    {
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System",
            "postgres",
            "sumai123"
        );
    }

    //  TOTAL DATA
    public double getTotalFish() throws Exception
    {
        ResultSet rs = connect().createStatement()
            .executeQuery("SELECT COALESCE(SUM(quantity),0) FROM purchase");
        return rs.next() ? rs.getDouble(1) : 0;
    }

    public double getTotalExpense() throws Exception
    {
        ResultSet rs = connect().createStatement()
            .executeQuery("SELECT COALESCE(SUM(amount),0) FROM expense");
        return rs.next() ? rs.getDouble(1) : 0;
    }

    public double getTotalSales() throws Exception
    {
        ResultSet rs = connect().createStatement()
            .executeQuery("SELECT COALESCE(SUM(total_price),0) FROM sales");
        return rs.next() ? rs.getDouble(1) : 0;
    }

    //  TODAY DATA
    public double getTodayFish() throws Exception
    {
        ResultSet rs = connect().createStatement()
            .executeQuery("SELECT COALESCE(SUM(quantity),0) FROM purchase WHERE purchase_date = CURRENT_DATE");
        return rs.next() ? rs.getDouble(1) : 0;
    }

    public double getTodayExpense() throws Exception
    {
        ResultSet rs = connect().createStatement()
            .executeQuery("SELECT COALESCE(SUM(amount),0) FROM expense WHERE expense_date = CURRENT_DATE");
        return rs.next() ? rs.getDouble(1) : 0;
    }

    public double getTodaySales() throws Exception
    {
        ResultSet rs = connect().createStatement()
            .executeQuery("SELECT COALESCE(SUM(total_price),0) FROM sales WHERE order_date = CURRENT_DATE");
        return rs.next() ? rs.getDouble(1) : 0;
    }

    //  PIE CHART DATA
    public List<DashboardModel> getExpenseByType() throws Exception
    {
        List<DashboardModel> list = new ArrayList<>();

        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT expense_type, SUM(amount) FROM expense GROUP BY expense_type"
        );

        while (rs.next())
        {
            list.add(new DashboardModel(
                rs.getString(1),
                rs.getDouble(2)
            ));
        }

        return list;
    }
    
}
