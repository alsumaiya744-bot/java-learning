
package financemanagement;

import java.util.List;

public class FinanceService
{
    
    FinanceDAO dao = new FinanceDAO();

    public List<FinanceModel> getFinance(String start, String end) throws Exception
    {
        return dao.getFinanceData(start, end);
    }

    public double getTotalSales(String start, String end) throws Exception
    {
        return dao.getTotalSales(start, end);
    }

    public double getTotalExpenses(String start, String end) throws Exception
    {
        return dao.getTotalExpenses(start, end);
    }

    //  BUSINESS LOGIC
    public double calculateProfit(double sales, double expense)
    {
        return sales - expense;
    }

    public String getProfitLabel(double profit)
    {
        return profit >= 0 ? "Profit" : "Loss";
    }

    // LAST MONTH (for cards)
    public double getLastMonthSales() throws Exception
    {
        return dao.getLastMonthSales();
    }

    public double getLastMonthExpenses() throws Exception
    {
        return dao.getLastMonthExpenses();
    }
    
}
