
package expensemanagement;

public class ExpenseModel
{
        private String expenseId;
        private String expenseType;
        private double amount;
        private String paidTo;
        private String date;
        private String notes;

    public ExpenseModel()
    {
        
    }

    public ExpenseModel(String expenseId, String expenseType, double amount,
                        String paidTo, String date, String notes)
    {
        this.expenseId = expenseId;
        this.expenseType = expenseType;
        this.amount = amount;
        this.paidTo = paidTo;
        this.date = date;
        this.notes = notes;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaidTo() {
        return paidTo;
    }

    public void setPaidTo(String paidTo) {
        this.paidTo = paidTo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
    
    
}
