
package employee;
import java.util.Scanner;

public class EmployeeMain {

   
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("enter employee name : ");
        String employeeName=obj.nextLine();
        System.out.print("enter salary : ");
        double employeeSalary=obj.nextDouble();
        Employee emp=new Employee(employeeName,employeeSalary);
        emp.displayInfo();
        System.out.print("enter employee name : ");
        obj.nextLine();
        String name=obj.nextLine();
        System.out.print("enter salary : ");
        double salary=obj.nextDouble();
        System.out.print("enter department : ");
        obj.nextLine();
        String department=obj.nextLine();
        Manager mn=new Manager(name,salary,department);
        mn.displayInfo();
    }
    
}
