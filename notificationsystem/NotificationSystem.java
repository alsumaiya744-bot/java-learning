
package notificationsystem;
import java.util.Scanner;
public class NotificationSystem {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       boolean exit=false;
       do
       {
           System.out.println("========================================");
           System.out.print("1. Send Email notification\n2. Send SMS notification\n3. Send push notification\n4. exit\n");
           System.out.println("========================================");
           System.out.println("enter your choice : ");
           int choice=obj.nextInt();
           switch(choice)
           {
               case 1:
                   NotificationFactory email=new EmailFactory();
                   email.send();
                   break;
               case 2:
                   NotificationFactory SMS=new SMSFactory();
                   SMS.send();
                   break;
               case 3:
                   NotificationFactory push=new PushFactory();
                   push.send();
                   break;
               case 4:
                   System.out.println("Thank You");
                   exit=true;
                   break;
               default :
                   System.out.println("Invalid Choice");
           }
       }while(!exit);
    }
    
}
