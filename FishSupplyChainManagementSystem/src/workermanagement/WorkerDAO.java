
package workermanagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkerDAO
{
    
         private Connection connect() throws Exception {
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/Fish_Supply_Chain_Management_System",
                "postgres",
                "sumai123"
        );
    }

    private double getSalaryByRole(String role) {
        switch (role) {
            case "Loader": return 8000;
            case "Packer": return 10000;
            case "Driver": return 12000;
            default: return 5000;
        }
    }

    // INSERT
    public void insertWorker(WorkerModel m) throws Exception {
        Connection con = connect();
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO worker VALUES (?,?,?,?,?)"
        );

        ps.setString(1, m.getWorkerId());
        ps.setString(2, m.getName());
        ps.setString(3, m.getRole());
        ps.setString(4, "Absent");
        ps.setDouble(5, getSalaryByRole(m.getRole()));

        ps.executeUpdate();

        ps.close();
        con.close();
    }

    // UPDATE
    public void updateWorker(WorkerModel m) throws Exception {
        Connection con = connect();
        PreparedStatement ps = con.prepareStatement(
                "UPDATE worker SET name=?, role=?, salary=? WHERE worker_id=?"
        );

        ps.setString(1, m.getName());
        ps.setString(2, m.getRole());
        ps.setDouble(3, getSalaryByRole(m.getRole()));
        ps.setString(4, m.getWorkerId());

        ps.executeUpdate();

        ps.close();
        con.close();
    }

    // DELETE
    public void deleteWorker(String id) throws Exception {
        Connection con = connect();
        PreparedStatement ps = con.prepareStatement(
                "DELETE FROM worker WHERE worker_id=?"
        );

        ps.setString(1, id);
        ps.executeUpdate();

        ps.close();
        con.close();
    }

    // ATTENDANCE
    public void markAttendance(String id) throws Exception {
        Connection con = connect();
        PreparedStatement ps = con.prepareStatement(
                "UPDATE worker SET attendance='Present' WHERE worker_id=?"
        );

        ps.setString(1, id);
        ps.executeUpdate();

        ps.close();
        con.close();
    }

    // FETCH
    public List<WorkerModel> getWorkers() throws Exception {
        Connection con = connect();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM worker");

        List<WorkerModel> list = new ArrayList<>();

        while (rs.next()) {
            list.add(new WorkerModel(
                    rs.getString("worker_id"),
                    rs.getString("name"),
                    rs.getString("role"),
                    rs.getString("attendance"),
                    rs.getDouble("salary")
            ));
        }

        rs.close();
        st.close();
        con.close();

        return list;
    }

    // IDS
    public List<String> getWorkerIds() throws Exception {
        Connection con = connect();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT worker_id FROM worker");

        List<String> list = new ArrayList<>();

        while (rs.next()) {
            list.add(rs.getString(1));
        }

        rs.close();
        st.close();
        con.close();

        return list;
    }

    // ID GENERATOR (BEST)
    public String generateNextWorkerId() throws Exception {
        Connection con = connect();
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(
                "SELECT worker_id FROM worker ORDER BY worker_id DESC LIMIT 1"
        );

        if (rs.next()) {
            String lastId = rs.getString(1);
            int num = Integer.parseInt(lastId.split("-")[1]);
            return "WRK-" + (num + 1);
        }

        return "WRK-1";
    }
    
}
