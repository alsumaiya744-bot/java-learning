
package workermanagement;

public class WorkerModel
{
    
          private String workerId, name, role, attendance;
    private double salary;

    public WorkerModel()
    {
        
    }

    public WorkerModel(String workerId, String name, String role, String attendance, double salary) {
        this.workerId = workerId;
        this.name = name;
        this.role = role;
        this.attendance = attendance;
        this.salary = salary;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
}
