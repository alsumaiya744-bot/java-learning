
package orderstatustracking;

import java.util.Scanner;

public class OrderStatusTracking {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        OrderTrack order=new OrderTrack();
        boolean exit=false;
        {
            System.out.println("======== MENU ========");
            System.out.print("1. show order status\n2. check if order is completed\n3. exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                    order.showOrderStatus();
                    break;
                case 2:
                    System.out.println("enter order status to check whether order is placed or not : ");
                    String status=obj.next();
                    order.checkOrder(status);
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
