
package SalesManagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SalesDAO
{
    
      Connection connect() throws Exception
    {
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System",
            "postgres",
            "sumai123"
        );
    }

    public void insertOrder(SalesModel m) throws Exception
    {
        String sql = """
                            INSERT INTO sales (
                            order_id, customer_id, customer_name, fish_id, fish_name,
                            quantity, price_per_unit, total_price, order_date,
                            invoice_id, invoice_status, delivery_status
                            )
                            VALUES (?,?,?,?,?,?,?,?,?,?,?,?)
                            """;

        try (Connection con = connect();
             PreparedStatement ps = con.prepareStatement(sql))
        {
            ps.setString(1, m.getOrderId());
            ps.setString(2, m.getCustomerId());
            ps.setString(3, m.getCustomerName());
            ps.setString(4, m.getFishId());
            ps.setString(5, m.getFishName());
            ps.setInt(6, m.getQuantity());
            ps.setDouble(7, m.getPricePerUnit());
            ps.setDouble(8, m.getTotalPrice());
            ps.setDate(9, Date.valueOf(m.getDate()));

            ps.setString(10, null); // ❗ IMPORTANT
            ps.setString(11, m.getInvoiceStatus());
            ps.setString(12, m.getDeliveryStatus());
            
            ps.executeUpdate();
        }
    }

    public List<SalesModel> getOrders() throws Exception
    {
        List<SalesModel> list = new ArrayList<>();

        String query = """
            SELECT s.*, COALESCE(d.status,'Pending') AS delivery_status
            FROM sales s
            LEFT JOIN delivery d ON s.invoice_id = d.invoice_id
        """;

        try (Connection con = connect();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query))
        {
            while (rs.next())
            {
                list.add(new SalesModel(
                    rs.getString("order_id"),
                    rs.getString("customer_id"),
                    rs.getString("customer_name"),
                    rs.getString("fish_id"),
                    rs.getString("fish_name"),
                    rs.getInt("quantity"),
                    rs.getDouble("price_per_unit"),
                    rs.getDouble("total_price"),
                    rs.getDate("order_date").toString(),
                    rs.getString("invoice_id"),
                    rs.getString("invoice_status"),
                    rs.getString("delivery_status")
                ));
            }
        }
        return list;
    }

    public void updateInvoice(String orderId, String invoiceId) throws Exception
    {
        try (Connection con = connect();
             PreparedStatement ps = con.prepareStatement(
                "UPDATE sales SET invoice_id=?, invoice_status='Generated' WHERE order_id=?"))
        {
            ps.setString(1, invoiceId);
            ps.setString(2, orderId);
            ps.executeUpdate();
        }
    }

    public void updateOrder(String id, int qty, double price, double total) throws Exception
    {
        try (Connection con = connect();
             PreparedStatement ps = con.prepareStatement(
                "UPDATE sales SET quantity=?, price_per_unit=?, total_price=? WHERE order_id=?"))
        {
            ps.setInt(1, qty);
            ps.setDouble(2, price);
            ps.setDouble(3, total);
            ps.setString(4, id);
            ps.executeUpdate();
        }
    }

    public void deleteOrder(String id) throws Exception
    {
        try (Connection con = connect();
             PreparedStatement ps = con.prepareStatement(
                "DELETE FROM sales WHERE order_id=?"))
        {
            ps.setString(1, id);
            ps.executeUpdate();
        }
    }

    public List<String> getCustomerIds() throws Exception
    {
        List<String> list = new ArrayList<>();
        ResultSet rs = connect().createStatement().executeQuery("SELECT customer_id FROM customer");
        while (rs.next()) list.add(rs.getString(1));
        return list;
    }

    public String getCustomerName(String id) throws Exception
    {
        PreparedStatement ps = connect().prepareStatement(
            "SELECT company_name FROM customer WHERE customer_id=?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        return rs.next() ? rs.getString(1) : "";
    }

    public List<String> getFishNames() throws Exception
    {
        List<String> list = new ArrayList<>();
        ResultSet rs = connect().createStatement().executeQuery("SELECT DISTINCT fish_name FROM purchase");
        while (rs.next()) list.add(rs.getString(1));
        return list;
    }

    public String getFishId(String name) throws Exception
    {
        PreparedStatement ps = connect().prepareStatement(
            "SELECT fish_id FROM purchase WHERE fish_name=? LIMIT 1");
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        return rs.next() ? rs.getString(1) : "";
    }
    
    
    
    public String generateNextInvoiceId() throws Exception
{
    String id = "INV-1";

    ResultSet rs = connect().createStatement().executeQuery(
        "SELECT COUNT(*) FROM sales WHERE invoice_id IS NOT NULL"
    );

    if (rs.next())
    {
        int count = rs.getInt(1) + 1;
        id = "INV-" + count;
    }

    return id;
}
    
}
