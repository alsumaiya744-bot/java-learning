
package deliveryandvehiclemanagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeliveryDAO
{
    
         Connection connect() throws Exception
         {
                return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System",
                    "postgres",
                    "sumai123"
                );
          }

    // GET INVOICE IDS
    public List<String> getInvoiceIds() throws Exception
    {
        List<String> list = new ArrayList<>();
        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT invoice_id FROM sales WHERE invoice_id IS NOT NULL"
        );

        while (rs.next()) list.add(rs.getString(1));
        return list;
    }

    // INSERT
    public void insertDelivery(DeliveryModel m) throws Exception
    {
        PreparedStatement ps = connect().prepareStatement(
            "INSERT INTO delivery VALUES (?,?,?,?,?,?,?,?,?)"
        );

        ps.setString(1, m.getDeliveryId());
        ps.setString(2, m.getInvoiceId());
        ps.setString(3, m.getVehicleNo());
        ps.setString(4, m.getDriverName());
        ps.setString(5, m.getFuelType());
        ps.setString(6, m.getCapacity());
        ps.setString(7, m.getLocation());
        ps.setTimestamp(8, Timestamp.valueOf(m.getDispatchTime()));
        ps.setString(9, m.getStatus());

        ps.executeUpdate();

        updateSalesStatus(m.getInvoiceId(), m.getStatus());
    }

    // UPDATE (ALL FIELDS USING DELIVERY ID)
    public void updateDelivery(DeliveryModel m) throws Exception
    {
        PreparedStatement ps = connect().prepareStatement(
            "UPDATE delivery SET invoice_id=?, vehicle_no=?, driver_name=?, fuel_type=?, capacity=?, location=?, dispatch_time=?, status=? WHERE delivery_id=?"
        );

        ps.setString(1, m.getInvoiceId());
        ps.setString(2, m.getVehicleNo());
        ps.setString(3, m.getDriverName());
        ps.setString(4, m.getFuelType());
        ps.setString(5, m.getCapacity());
        ps.setString(6, m.getLocation());
        ps.setTimestamp(7, Timestamp.valueOf(m.getDispatchTime()));
        ps.setString(8, m.getStatus());
        ps.setString(9, m.getDeliveryId());

        ps.executeUpdate();

        updateSalesStatus(m.getInvoiceId(), m.getStatus());
    }

    // DELETE
    public void deleteDelivery(String id) throws Exception
    {
        PreparedStatement ps = connect().prepareStatement(
            "DELETE FROM delivery WHERE delivery_id=?"
        );
        ps.setString(1, id);
        ps.executeUpdate();
    }

    // UPDATE SALES STATUS
    public void updateSalesStatus(String invoiceId, String status) throws Exception
    {
        PreparedStatement ps = connect().prepareStatement(
        "UPDATE sales SET delivery_status=? WHERE invoice_id=?"
    );
    ps.setString(1, status);
    ps.setString(2, invoiceId);
    ps.executeUpdate();
    }

    // FETCH
    public List<DeliveryModel> getDeliveries() throws Exception
    {
        List<DeliveryModel> list = new ArrayList<>();
        ResultSet rs = connect().createStatement().executeQuery("SELECT * FROM delivery");

        while (rs.next())
        {
            list.add(new DeliveryModel(
                rs.getString("delivery_id"),
                rs.getString("invoice_id"),
                rs.getString("vehicle_no"),
                rs.getString("driver_name"),
                rs.getString("fuel_type"),
                rs.getString("capacity"),
                rs.getString("location"),
                rs.getTimestamp("dispatch_time").toString(),
                rs.getString("status")
            ));
        }
        return list;
    }
    
    
    public List<String> getDeliveryIds() throws Exception
    {
        List<String> list = new ArrayList<>();

        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT delivery_id FROM delivery"
        );

        while (rs.next())
        {
            list.add(rs.getString(1));
        }

        return list;
    }
}
