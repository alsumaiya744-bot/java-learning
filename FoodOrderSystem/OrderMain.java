package FoodOrderSystem;
import java.util.Scanner;
public class OrderMain {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        boolean exit=false;
        String name="null";
        String foodName="null";
        double price=0.0;
        FoodOrder food=new FoodOrder(name, foodName, price);
        do
        {
            System.out.println("----- Online Food Order System -----");
            System.out.print("1. place order\n2. view bill\n3. exit\n");
            System.out.print("enter your choice : ");
            byte choice=obj.nextByte();
            obj.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("enter customer name : ");
                    name=obj.nextLine();
                    System.out.print("enter food item : ");
                    foodName=obj.nextLine();
                    System.out.print("enter price : ");
                    price=obj.nextDouble();
                    food=new FoodOrder(name, foodName, price);
                    food.placeOreder();
                    break;
                case 2:
                    if(price>0.0)
                    {
                        food.showBill();
                    }
                    else
                    {
                        System.out.println("place order first");
                    }
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
