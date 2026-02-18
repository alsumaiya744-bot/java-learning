
package employeessalarycalculation;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(double salary) {
        super(salary);
    }
    
     @Override
     public void run()
    {
        System.out.println("Salary for permanent employee :"+salary);
    }
}
