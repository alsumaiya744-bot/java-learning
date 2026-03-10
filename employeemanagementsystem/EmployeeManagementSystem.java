
package employeemanagementsystem;

import java.security.Provider;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        Employee e=new Employee(0, null, null);
        EmployeeServiceClass service=new EmployeeServiceClass();
        
        boolean exit=false;
        do
        {
            System.out.print("1. Add\n2. View\n3. Search\n4. Exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("enter employee ID : ");
                    int ID=obj.nextInt();
                    obj.nextLine();
                    System.out.println("enter employee name : ");
                    String name =obj.nextLine();
                    System.out.println("enter department : ");
                    String department=obj.nextLine();
                    e=new Employee(ID, name, department);
                    service.add(e);
                    break;
                case 2:
                    service.display();
                    break;
                case 3:
                    System.out.println("enter employee ID to search : ");
                    int Id=obj.nextInt();
                    service.search(Id);
                    break;
                case 4:
                    System.out.println("Thank you");
                    exit=true;
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }while(!exit);
    }
    
}
