
package studentsrecords;


import java.sql.*;

public class StudentsRecordDAO {
    Connection connect() throws ClassNotFoundException, SQLException
    {
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/Students_Records";
        String user="postgres";
        String pass="sumai123";
        Connection con=(Connection) DriverManager.getConnection(url,user,pass);
        return con;
    }
    int createStudentsRecords(int rollNo,String name,short age,String dept) throws ClassNotFoundException, SQLException
    {
        Connection con=connect();
        PreparedStatement ps = con.prepareStatement("insert into Student_Details values(?,?,?,?)");
        ps.setInt(1, rollNo);
        ps.setString(2, name);
        ps.setInt(3, age);
        ps.setString(4, dept);
        int res=ps.executeUpdate();
        return res;
    }
    int updateStudentsRecords(int option,int rollNo,String value) throws ClassNotFoundException, SQLException
    {
        Connection con=connect();
        PreparedStatement ps=null;
        if(option==1)
        {
            ps = con.prepareStatement("update Student_Details set name=? where roll_no=?");
            ps.setInt(2, rollNo);
            ps.setString(1, value);
        }
        else if(option==2)
        {
            ps = con.prepareStatement("update Student_Details set age=? where roll_no=?");
            ps.setInt(2, rollNo);
            ps.setInt(1, Integer.parseInt(value));
        }
        else if(option==3)
        {
            ps = con.prepareStatement("update Student_Details set dept=? where roll_no=?");
            ps.setInt(2, rollNo);
            ps.setString(1, value);
        }
        else
        {
            System.out.println("invalid option");
        }
        
        int res=ps.executeUpdate();
        return res;
    }
    int deleteStudentsRecords(int rollNo) throws ClassNotFoundException, SQLException
    {
        Connection con=connect();
        PreparedStatement ps = con.prepareStatement("delete from Student_Details where roll_no=?");
        ps.setInt(1, rollNo);
        
        int res=ps.executeUpdate();
        return res;
    }
    void display() throws ClassNotFoundException, SQLException
    {
        Connection con=connect();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select* from Student_Details");
        while(rs.next())
        {
            System.out.println(rs.getInt("roll_no")+"->"+rs.getString("name")+","+rs.getInt("age")+","+rs.getString("dept"));
        }
     
    }
    
    
}
