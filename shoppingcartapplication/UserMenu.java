package shoppingcartapplication;
import java.util.Scanner;
public class UserMenu {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        ShoppingCart shopping=new ShoppingCart();
        boolean exit=false;
        do
        {
            System.out.println("------ MENU ------");
            System.out.print("1. Add Product\n2. View Cart Items\n3. Exit\n");
            System.out.print("Enter your choice : ");
            int choice=obj.nextInt();
            obj.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter product name : ");
                    String name=obj.nextLine();
                    System.out.print("Enter product ID : ");
                    int ID=obj.nextInt();
                    shopping.insertProduct(ID, name);
                    break;
                case 2:
                    shopping.display();
                    break;
                case 3:
                    System.out.println("Thank You");
                    exit=true;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(!exit);
    }
    
}
