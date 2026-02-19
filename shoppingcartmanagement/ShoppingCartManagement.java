
package shoppingcartmanagement;
import java.util.Scanner;
public class ShoppingCartManagement {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter Cart owner name : ");
        String cartOwnerName=obj.nextLine();
        ShoppingCart.Item shop=new ShoppingCart(cartOwnerName).new Item();
        boolean exit=false;
        do
        {
            System.out.print("1. Add item\n2. update price history\n3. Calculate total bill\n4. Display cart details\n5. exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            obj.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.println("item name : ");
                    String name=obj.nextLine();
                    System.out.println("enter quantity : ");
                    int quantity=obj.nextInt();
                    shop.addItems(name, quantity);
                    break;
                case 2:
                    System.out.println("enter number of price updates : ");
                    int updates=obj.nextInt();
                    shop.updatePrice(updates);
                    break;
                case 3:
                    shop.calculteBill();
                    break;
                case 4: 
                    shop.displayCartDetails();
                    break;
                case 5:
                    System.out.println("Thank You");
                    exit=true;
                    break;
                default :
                    System.out.println("invalid choice");
            }
        }while(!exit);
    }
    
}
