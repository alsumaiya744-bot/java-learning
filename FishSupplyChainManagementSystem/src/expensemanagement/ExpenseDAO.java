
package expensemanagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseDAO
{
    
    Connection connect() throws Exception
    {
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System",
            "postgres",
            "sumai123"
        );
    }

    //  GENERATE EXPENSE ID
    public String generateExpenseId() throws Exception
    {
        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT COUNT(*) FROM expense"
        );

        if (rs.next())
        {
            int count = rs.getInt(1) + 1;
            return "EXP-" + count;
        }
        return "EXP-1";
    }

    // INSERT
    public void insertExpense(ExpenseModel m) throws Exception
    {
        PreparedStatement ps = connect().prepareStatement(
            "INSERT INTO expense VALUES (?,?,?,?,?,?)"
        );

        ps.setString(1, m.getExpenseId());
        ps.setString(2, m.getExpenseType());
        ps.setDouble(3, m.getAmount());
        ps.setString(4, m.getPaidTo());
        ps.setDate(5, Date.valueOf(m.getDate()));
        ps.setString(6, m.getNotes());

        ps.executeUpdate();
    }

    // UPDATE
    public void updateExpense(ExpenseModel m) throws Exception
    {
        PreparedStatement ps = connect().prepareStatement(
            "UPDATE expense SET expense_type=?, amount=?, paid_to=?, expense_date=?, notes=? WHERE expense_id=?"
        );

        ps.setString(1, m.getExpenseType());
        ps.setDouble(2, m.getAmount());
        ps.setString(3, m.getPaidTo());
        ps.setDate(4, Date.valueOf(m.getDate()));
        ps.setString(5, m.getNotes());
        ps.setString(6, m.getExpenseId());

        ps.executeUpdate();
    }

    // DELETE
    public void deleteExpense(String id) throws Exception
    {
        PreparedStatement ps = connect().prepareStatement(
            "DELETE FROM expense WHERE expense_id=?"
        );
        ps.setString(1, id);
        ps.executeUpdate();
    }

    // FETCH
    public List<ExpenseModel> getExpenses() throws Exception
    {
        List<ExpenseModel> list = new ArrayList<>();

        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT * FROM expense ORDER BY expense_date DESC"
        );

        while (rs.next())
        {
            list.add(new ExpenseModel(
                rs.getString("expense_id"),
                rs.getString("expense_type"),
                rs.getDouble("amount"),
                rs.getString("paid_to"),
                rs.getDate("expense_date").toString(),
                rs.getString("notes")
            ));
        }

        return list;
    }
    
}
