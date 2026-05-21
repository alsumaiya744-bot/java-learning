
package createaccount;
import java.sql.*;
public class UserDAO
{
     Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System";
        String user = "postgres";
        String pass = "sumai123";
        return DriverManager.getConnection(url, user, pass);
    }

    public int createUser(UserInputModel user) throws ClassNotFoundException, SQLException {

        Connection con = connect();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO users(username,password,role,mobile) VALUES(?,?,?,?)"
        );

        ps.setString(1, user.getUsername());
        ps.setString(2, user.getPassword());
        ps.setString(3, user.getRole());
        ps.setString(4, user.getMobile());

        int result = ps.executeUpdate();
        return result;
    }
}
