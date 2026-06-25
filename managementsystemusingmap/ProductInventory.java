
package managementsystemusingmap;

import java.util.HashMap;
import java.util.Scanner;

public class ProductInventory
{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> products = new HashMap<>();

        MapOperations<String, Integer> obj =new MapOperations<>(products);
                
        boolean exit=false;
        int choice;

        do {

            System.out.print("1.Add\n2. search\n3. update\n4. delete\n5. display\n6. exit\n");
            

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Product Name : ");
                    String name = sc.nextLine();

                    System.out.print("Quantity : ");
                    int qty = sc.nextInt();

                    obj.add(name, qty);
                    break;

                case 2:
                    System.out.print("Product Name : ");
                    name = sc.nextLine();

                    obj.search(name);
                    break;

                case 3:
                    System.out.print("Product Name : ");
                    name = sc.nextLine();

                    System.out.print("New Quantity : ");
                    qty = sc.nextInt();

                    obj.update(name, qty);
                    break;

                case 4:
                    System.out.print("Product Name : ");
                    name = sc.nextLine();

                    obj.delete(name);
                    break;

                case 5:
                    obj.display();
                    break;

                case 6:
                    exit=true;
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }while(!exit);
 }
}
