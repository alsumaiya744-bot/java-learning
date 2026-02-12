
package mobileshopmanagement;
import java.util.Scanner;
public class MobileShopManagement {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        
        boolean exit=false;
         MobileUpdate update=new MobileUpdate();
        do
        {
            System.out.println("1. Add Latest Lanuch\n2. Add Regular Stock\n3. Display Mobiles\n4. Exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
           
            switch(choice)
            {
                case 1:
                    System.out.println("enter mobile ID : ");
                    int mobileID=obj.nextInt();
                    obj.nextLine();
                    System.out.println("enter mobile brand : ");
                    String brandName=obj.nextLine();
                    System.out.println("enter price : ");
                    double price=obj.nextDouble();
                    update.insertAtHead(mobileID, brandName, price);
                    break;
                case 2:
                    System.out.println("enter mobile ID : ");
                    int mobileID1=obj.nextInt();
                    obj.nextLine();
                    System.out.println("enter mobile brand : ");
                    String brandName1=obj.nextLine();
                    System.out.println("enter price : ");
                    double price1=obj.nextDouble();
                    update.insertAtTail(mobileID1, brandName1, price1);
                    break;
                case 3:
                    update.display();
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
