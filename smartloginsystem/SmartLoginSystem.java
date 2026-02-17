
package smartloginsystem;
import java.util.Scanner;
import javax.security.auth.login.AccountLockedException;
public class SmartLoginSystem {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter user name : ");
        String logName=obj.nextLine();
        System.out.println("enter password : ");
        String logPassword=obj.nextLine();
        Login log=new Login(logName, logPassword);
        boolean exit=false;
        do
        {
            System.out.println("1. Login\n2. Exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            obj.nextLine();
            switch(choice)
            {
                case 1:
                    try
                    {
                        System.out.println("enter user name : ");
                        String name=obj.nextLine();
                        System.out.println("enter passwor : ");
                        String password=obj.nextLine();
                        log.login(name, password);
                    }
                    catch(AccountLockedException ex)
                    {
                        System.out.println(ex.getMessage());
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Thank You");
                    exit=true;
                    break;
                default :
                    System.out.println("invalid choice");
            }
        }while(!exit);
    }
    
}
