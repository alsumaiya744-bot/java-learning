
package fishsupplychainmanagementsystem;
import java.sql.*;

public class LoginDAO 
{
    Connection connect() throws ClassNotFoundException, SQLException 
    {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System",
            "postgres",
            "sumai123"
        );
    }
     public LoginModel getUser(String username) throws Exception 
     {

        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM users WHERE username=?"
        );

        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
//if
        while (rs.next()) {
            return new LoginModel(
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("role")
            );
        }

        return null;
    }

    // 🔥 DELETE USER (FOR RESET BUTTON)
    public int deleteUser(String username) throws Exception
    {

        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "DELETE FROM users WHERE username=?"
        );

        ps.setString(1, username);

        return ps.executeUpdate();
    }
}
