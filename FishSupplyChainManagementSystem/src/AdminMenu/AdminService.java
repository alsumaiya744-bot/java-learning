
package AdminMenu;

import java.util.List;

public class AdminService
{
    
    AdminDAO dao = new AdminDAO();

    public double getTotalFish() throws Exception { return dao.getTotalFish(); }
    public double getTotalExpense() throws Exception { return dao.getTotalExpense(); }
    public double getTotalSales() throws Exception { return dao.getTotalSales(); }

    public double getTodayFish() throws Exception { return dao.getTodayFish(); }
    public double getTodayExpense() throws Exception { return dao.getTodayExpense(); }
    public double getTodaySales() throws Exception { return dao.getTodaySales(); }

    public double getNetProfit() throws Exception
    {
        return getTotalSales() - getTotalExpense();
    }

    public double getTodayProfit() throws Exception
    {
        return getTodaySales() - getTodayExpense();
    }

    public List<DashboardModel> getPieChartData() throws Exception
    {
        return dao.getExpenseByType();
    }
    
}
