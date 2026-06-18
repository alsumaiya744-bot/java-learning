package com.example.food;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class FoodRepository {

    private Connection getConnection() throws Exception {

        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5432/Food_Order";
        String user = "postgres";
        String password = "sumai123";

        return DriverManager.getConnection(url, user, password);
    }

    // Add Food
    public int addFood(FoodItem food) throws Exception {

        Connection con = getConnection();

        String sql = "INSERT INTO food_orders(food_name,price,category,availability) VALUES(?,?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, food.getFoodName());
        ps.setDouble(2, food.getPrice());
        ps.setString(3, food.getCategory());
        ps.setBoolean(4, food.isAvailability());

        return ps.executeUpdate();
    }

    public int updateFood(int id, FoodItem food) throws Exception {

    Connection con = getConnection();

    String sql =
    "UPDATE food_orders SET food_name=?, price=?, availability=? WHERE id=?";

    PreparedStatement ps = con.prepareStatement(sql);

    ps.setString(1, food.getFoodName());
    ps.setDouble(2, food.getPrice());
    ps.setBoolean(3, food.isAvailability());
    ps.setInt(4, id);

    return ps.executeUpdate();
}
   
    public FoodItem searchById(int id) throws Exception {

        Connection con = getConnection();

        String sql = "SELECT * FROM food_orders WHERE id=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            return new FoodItem(
                    rs.getInt("id"),
                    rs.getString("food_name"),
                    rs.getDouble("price"),
                    rs.getString("category"),
                    rs.getBoolean("availability"));
        }

        return null;
    }

    
    public List<FoodItem> getAllFoods() throws Exception {

        Connection con = getConnection();

        String sql = "SELECT * FROM food_orders";

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        List<FoodItem> list = new ArrayList<>();

        while (rs.next()) {

            list.add(
                new FoodItem(
                    rs.getInt("id"),
                    rs.getString("food_name"),
                    rs.getDouble("price"),
                    rs.getString("category"),
                    rs.getBoolean("availability")
                )
            );
        }

        return list;
    }

    
    public int deleteFood(int id) throws Exception {

        Connection con = getConnection();

        String sql = "DELETE FROM food_orders WHERE id=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        return ps.executeUpdate();
    }
}