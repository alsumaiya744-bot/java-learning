
package expensemanagement;

import java.util.List;

public class ExpenseService
{
    
    ExpenseDAO dao = new ExpenseDAO();

    public String generateExpenseId() throws Exception
    {
        return dao.generateExpenseId();
    }

    public void addExpense(ExpenseModel m) throws Exception
    {
        dao.insertExpense(m);
    }

    public void updateExpense(ExpenseModel m) throws Exception
    {
        dao.updateExpense(m);
    }

    public void deleteExpense(String id) throws Exception
    {
        dao.deleteExpense(id);
    }

    public List<ExpenseModel> getExpenses() throws Exception
    {
        return dao.getExpenses();
    }
    
}
