
package employeessalarycalculation;

import java.util.Scanner;

public class EmployeesSalaryCalculation {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double pSalary=0;
        double cSalary=0;
        boolean exit=false;
        do
        {
                System.out.println("1. Fix permanent employee salary\n2. Fix contract employee salary\n3. display salary\n4. exit\n");
                System.out.println("enter your choice : ");
                int choice=obj.nextInt();

                switch(choice)
                {
                    case 1:
                        System.out.println("enter salary of permanent employee : ");
                        pSalary=obj.nextDouble();
                        break;
                    case 2:
                        System.out.println("enter the salary of contract employee : ");
                         cSalary=obj.nextDouble();
                        break;
                    case 3:
                        PermanentEmployee per=new PermanentEmployee(pSalary);
                        ContractEmployee con=new ContractEmployee(cSalary);
                        per.start();
                        con.start();
                    {
                        try {
                            per.join();
                        } catch (InterruptedException ex) {
                            System.getLogger(EmployeesSalaryCalculation.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                        }
                    }
                    {
                        try {
                            con.join();
                        } catch (InterruptedException ex) {
                            System.getLogger(EmployeesSalaryCalculation.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                        }
                    }
                    break;

                    case 4: 
                        System.out.println("Thank You");
                        exit=true;
                        break;
                    default :
                        System.out.println("invalid choice");
                }
        }while(!exit);
    }
    
}
