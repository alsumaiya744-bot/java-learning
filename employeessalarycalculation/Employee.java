
package employeessalarycalculation;

public class Employee extends Thread {
    double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void run()
    {
        System.out.println("Employee Salary :"+salary);
    }
            
}
