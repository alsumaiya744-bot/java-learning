
package Procurement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProcurementDAO
{
     
     Connection connect() throws Exception {
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System",
            "postgres",
            "sumai123"
        );
    }

    // ================= SUPPLIER =================

    private String generateSupplierId(Connection con) throws Exception {
        ResultSet rs = con.createStatement().executeQuery("SELECT COUNT(*) FROM supplier");
        rs.next();
        return "SUP-" + (rs.getInt(1) + 1);
    }

    public void insertSupplier(SupplierInputModel m) throws Exception {
        Connection con = connect();

        String id = generateSupplierId(con);

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO supplier VALUES (?,?,?,?,?)"
        );

        ps.setString(1, id);
        ps.setString(2, m.getName());
        ps.setString(3, m.getPhone());
        ps.setString(4, m.getLocation());
        ps.setString(5, m.getPayment());

        ps.executeUpdate();
    }

    public List<SupplierViewModel> getSuppliers() throws Exception {
        List<SupplierViewModel> list = new ArrayList<>();

        Connection con = connect();
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM supplier");

        while (rs.next()) {
            list.add(new SupplierViewModel(
                rs.getString("supplier_id"),
                rs.getString("name"),
                rs.getString("phone"),
                rs.getString("location")
            ));
        }
        return list;
    }

    public List<String> getSupplierIds() throws Exception {
        List<String> list = new ArrayList<>();
        Connection con = connect();

        ResultSet rs = con.createStatement().executeQuery("SELECT supplier_id FROM supplier");

        while (rs.next())
            list.add(rs.getString(1));

        return list;
    }

    // ================= FISH MASTER =================

    public String getOrCreateFishId(Connection con, String fishName) throws Exception {

        PreparedStatement ps = con.prepareStatement(
            "SELECT fish_id FROM fish_master WHERE fish_name=?"
        );
        ps.setString(1, fishName);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) return rs.getString(1);

        ResultSet count = con.createStatement().executeQuery("SELECT COUNT(*) FROM fish_master");
        count.next();

        String id = "FISH-" + (count.getInt(1) + 1);

        PreparedStatement insert = con.prepareStatement(
            "INSERT INTO fish_master VALUES (?,?)"
        );

        insert.setString(1, id);
        insert.setString(2, fishName);
        insert.executeUpdate();

        return id;
    }

    // ================= PURCHASE =================

    public void insertPurchase(PurchaseInputModel m) throws Exception {

        Connection con = connect();

        String fishId = getOrCreateFishId(con, m.getFishType());

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO purchase (purchase_id,supplier_id,fish_id,fish_name,quantity,weight,unit_price,total_price,payment_method,purchase_date) VALUES (?,?,?,?,?,?,?,?,?,CURRENT_DATE)"
        );

        ps.setString(1, m.getPurchaseId());
        ps.setString(2, m.getSupplierId());
        ps.setString(3, fishId);
        ps.setString(4, m.getFishType());
        ps.setInt(5, m.getQuantity());
        ps.setDouble(6, m.getWeight());
        ps.setDouble(7, m.getUnitPrice());
        ps.setDouble(8, m.getTotalPrice());
        ps.setString(9, m.getPaymentMethod());

        ps.executeUpdate();
    }

    public List<PurchaseViewModel> getPurchases() throws Exception {

        List<PurchaseViewModel> list = new ArrayList<>();

        Connection con = connect();
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM purchase");

        while (rs.next()) {
            list.add(new PurchaseViewModel(
                rs.getString("purchase_id"),
                rs.getString("supplier_id"),
                rs.getString("fish_name"),
                rs.getInt("quantity"),
                rs.getDouble("weight"),
                rs.getDouble("total_price"),
                rs.getString("purchase_date")
            ));
        }

        return list;
    }
    
    
    
    // UPDATE SUPPLIER
    public void updateSupplierByPhone(String phone, SupplierInputModel m) throws Exception {

        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "UPDATE supplier SET name=?, location=?, payment_status=? WHERE phone=?"
        );

        ps.setString(1, m.getName());
        ps.setString(2, m.getLocation());
        ps.setString(3, m.getPayment());
        ps.setString(4, phone);

        ps.executeUpdate();
    }


    // DELETE SUPPLIER
    public void deleteSupplierByPhone(String phone) throws Exception {

        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "DELETE FROM supplier WHERE phone=?"
        );

        ps.setString(1, phone);

        ps.executeUpdate();
    }
    
    public void deletePurchase(String id) throws Exception
    {

        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "DELETE FROM purchase WHERE purchase_id=?"
        );

        ps.setString(1, id);
        ps.executeUpdate();
    }

}
