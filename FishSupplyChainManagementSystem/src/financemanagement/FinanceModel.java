
package financemanagement;

public class FinanceModel
{
    
     private String date;
    private String details;
    private double totalSales;
    private double totalExpenses;
    private double profitOrLoss;

    public FinanceModel() {
    }
    
    

    public FinanceModel(String date, String details,
                        double totalSales, double totalExpenses, double profitOrLoss)
    {
        this.date = date;
        this.details = details;
        this.totalSales = totalSales;
        this.totalExpenses = totalExpenses;
        this.profitOrLoss = profitOrLoss;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public double getProfitOrLoss() {
        return profitOrLoss;
    }

    public void setProfitOrLoss(double profitOrLoss) {
        this.profitOrLoss = profitOrLoss;
    }
    
    
    
    
}
