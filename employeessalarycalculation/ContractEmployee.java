
package employeessalarycalculation;

public class ContractEmployee extends Employee {

    public ContractEmployee(double salary) {
        super(salary);
    }
    
    @Override
    public void run()
    {
        System.out.println("Salary for Contract Employee :"+salary);
    }
}
