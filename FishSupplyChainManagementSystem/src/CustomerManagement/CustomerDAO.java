
package CustomerManagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO
{
    
     Connection connect() throws Exception
     {
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System",
            "postgres",
            "sumai123"
        );
    }

    // INSERT
    public void insertCustomer(CustomerModel m) throws Exception
    {
        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO customer VALUES (?,?,?,?,?,?)"
        );

        ps.setString(1, m.getCustomerId());
        ps.setString(2, m.getContactPerson());
        ps.setString(3, m.getCompanyName());
        ps.setString(4, m.getPhone());
        ps.setString(5, m.getLocation());
        ps.setString(6, m.getPaymentTerms());

        ps.executeUpdate();
    }

    // UPDATE
    public void updateCustomer(CustomerModel m) throws Exception
    {
        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "UPDATE customer SET contact_person=?, company_name=?, phone=?, location=?, payment_terms=? WHERE customer_id=?"
        );

        ps.setString(1, m.getContactPerson());
        ps.setString(2, m.getCompanyName());
        ps.setString(3, m.getPhone());
        ps.setString(4, m.getLocation());
        ps.setString(5, m.getPaymentTerms());
        ps.setString(6, m.getCustomerId());

        ps.executeUpdate();
    }

    // DELETE
    public void deleteCustomer(String id) throws Exception
    {
        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "DELETE FROM customer WHERE customer_id=?"
        );

        ps.setString(1, id);
        ps.executeUpdate();
    }

    // GET ALL
    public List<CustomerModel> getCustomers() throws Exception
    {
        List<CustomerModel> list = new ArrayList<>();

        Connection con = connect();
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM customer");

        while (rs.next()) {
            list.add(new CustomerModel(
                rs.getString("customer_id"),
                rs.getString("contact_person"),
                rs.getString("company_name"),
                rs.getString("phone"),
                rs.getString("location"),
                rs.getString("payment_terms")
            ));
        }

        return list;
    }

    // GET IDS (FOR SALES)
    public List<String> getCustomerIds() throws Exception
    {
        List<String> list = new ArrayList<>();
        Connection con = connect();

        ResultSet rs = con.createStatement().executeQuery(
            "SELECT customer_id FROM customer"
        );

        while (rs.next())
            list.add(rs.getString(1));

        return list;
    }
    
}
