
package FishManagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FishDAO
{
    
     Connection connect() throws Exception {
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System",
            "postgres",
            "sumai123"
        );
    }

    public List<String> getFishIds() throws Exception {
        List<String> list = new ArrayList<>();
        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT DISTINCT fish_id FROM purchase"
        );

        while (rs.next()) list.add(rs.getString(1));
        return list;
    }

    public List<String> getFishNames() throws Exception {
        List<String> list = new ArrayList<>();
        ResultSet rs = connect().createStatement().executeQuery(
            "SELECT DISTINCT fish_name FROM purchase"
        );

        while (rs.next()) list.add(rs.getString(1));
        return list;
    }

    public void insertFish(FishModel m) throws Exception {

        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO fish_details (fish_id,category,avg_price,storage_type,image_path,date) VALUES (?,?,?,?,?,CURRENT_DATE)"
        );

        ps.setString(1, m.getFishId());
        ps.setString(2, m.getCategory());
        ps.setDouble(3, m.getAveragePrice());
        ps.setString(4, m.getStorageType());
        ps.setString(5, m.getImagePath());

        ps.executeUpdate();
    }

    public List<FishModel> getFishData() throws Exception
    {
                List<FishModel> list = new ArrayList<>();

          String query =  """
            SELECT 
                p.fish_id,
                p.fish_name,
                d.category,
                d.avg_price,
                d.storage_type,
                d.image_path,
                d.date,
                GREATEST(SUM(p.quantity) - COALESCE(SUM(s.quantity),0), 0) AS qty
            FROM purchase p
            LEFT JOIN sales s ON p.fish_id = s.fish_id
            LEFT JOIN fish_details d ON p.fish_id = d.fish_id
            GROUP BY 
                p.fish_id,
                p.fish_name,
                d.category,
                d.avg_price,
                d.storage_type,
                d.image_path,
                d.date
        """;

          ResultSet rs = connect().createStatement().executeQuery(query);

          while (rs.next()) {

              int qty = rs.getInt("qty");

              String status = qty > 10 ? "OK" : "LOW";

              list.add(new FishModel(
                  rs.getString("fish_id"),
                  rs.getString("fish_name"),
                  rs.getString("category"),
                  rs.getDouble("avg_price"),
                  qty,
                  rs.getString("storage_type"),
                  status,
                  rs.getString("date"),
                  rs.getString("image_path")
              ));
          }

          return list;
        
    }
    
    
    
    
    // UPDATE FISH
    public void updateFish(FishModel m) throws Exception {

        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "UPDATE fish_details SET category=?, avg_price=?, storage_type=?, image_path=? WHERE fish_id=?"
        );

        ps.setString(1, m.getCategory());
        ps.setDouble(2, m.getAveragePrice());
        ps.setString(3, m.getStorageType());
        ps.setString(4, m.getImagePath());
        ps.setString(5, m.getFishId());

        ps.executeUpdate();
    }


    // DELETE FISH
    public void deleteFish(String id) throws Exception {

        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "DELETE FROM fish_details WHERE fish_id=?"
        );

        ps.setString(1, id);

        ps.executeUpdate();
    }
    
}
