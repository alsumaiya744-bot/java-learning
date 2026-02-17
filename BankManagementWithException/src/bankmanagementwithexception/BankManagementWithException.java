
package bankmanagementwithexception;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.naming.InsufficientResourcesException;
public class BankManagementWithException {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double balanceAmount=0;
        double amount=0;
        try
        {
            System.out.println("enter the balance amount : ");
            balanceAmount=obj.nextDouble();
        }
        catch(InputMismatchException ex)
        {
            System.out.println("enter correct amount");
        }
        Bank b=new Bank(balanceAmount);
        boolean exit=false;
        do
        {
            System.out.print("1. Withdraw Money\n2. check balance\n3. exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                    try
                    {
                        System.out.println("enter withdraw amount : ");
                        amount=obj.nextDouble();
                        b.withdraw(amount);
                    }
                    catch(InputMismatchException ex)
                    {
                        System.out.println("enter correct amount");
                    }
                    catch(ArithmeticException ar)
                    {
                        System.out.println(ar.getMessage());  
                    }
                    break;
                case 2:
                    b.checkBalance();
                    break;
                case 3:
                    System.out.println("Thank You");
                    exit=true;
                    break;
                default:
                      System.out.println("invalid choice");  
            }
        }while(!exit);
    }
    
}
