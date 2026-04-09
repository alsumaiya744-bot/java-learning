
package supermarketdetails;
import java.sql.*;
public class SupermarketDAO {
    
    Connection connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/Supermarket";
        String user="postgres";
        String pass="sumai123";
        Connection con=DriverManager.getConnection(url, user, pass);
        return con;
    }
    void createCustomerTable() throws ClassNotFoundException, SQLException
    {
        Connection con=connect();
        Statement stmt=con.createStatement();
        String customer="create table Customer(customer_id int primary key,customer_name varchar(30) not null,city varchar(30),grade smallint,salesman_id int not null)";
        stmt.executeUpdate(customer);
        System.out.println("Customer table created successfully");
    }
    void createOrderTable() throws ClassNotFoundException, SQLException
    {
        Connection con=connect();
        Statement stmt=con.createStatement();
        String order="create table Order(ord_no int primary key,purch_amt decimal not null,ord_date date,customer_id int not null,salesman_id int not null)";
        stmt.executeUpdate(order);
        System.out.println("Order table created successfully");
    }
    
    int insertCustomerValues(CustomerModel sm) throws ClassNotFoundException, SQLException
    {
        Connection con=connect();
        PreparedStatement ps=con.prepareStatement("insert into Customer values(?,?,?,?,?)");
        ps.setInt(1, sm.getCusdomerID());
        ps.setString(2, sm.getCustomerName());
        ps.setString(3, sm.getCity());
        ps.setShort(4, sm.getGrade());
        ps.setInt(5, sm.getSalesmanID());
        int res=ps.executeUpdate();
        return res;
    }
    int insertOrderValues(OrderModel om) throws ClassNotFoundException, SQLException
    {
        Connection con=connect();
        PreparedStatement ps=con.prepareStatement("insert into Order values(?,?,?,?,?)");
        ps.setInt(1,om.getOrderID() );
        ps.setDouble(2, om.getPurchaseAmount());
        ps.setDate(3,java.sql.Date.valueOf(om.getOrderDate()));
        ps.setInt(4,om.getCustomerID() );
        ps.setInt(5,om.getSalesmanID() );
        int res=ps.executeUpdate();
        return res;
    }
    void displayValues(int min,int max) throws ClassNotFoundException, SQLException
    {
        Connection con=connect();
        String query="select o.ord_no,o.purch_amt,c.customer_name,c.city from Order o join Customer c on o.customer_id=c.customer_id where o.purch_amt between ? and ? ";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1, min);
        ps.setInt(2, max);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getInt("ord_no")+"|"+rs.getDouble("purch_amt")+"|"+rs.getString("customer_name")+"|"+rs.getString("city"));
        }
    }
}
