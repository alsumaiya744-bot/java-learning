
package managementsystemusingmap;

import java.util.HashMap;
import java.util.Scanner;

public class LibraryManagement 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, String> books = new HashMap<>();

        MapOperations<Integer, String> obj = new MapOperations<>(books);
        
        boolean exit=false;
        int choice ;
        do {

            System.out.println("===== Library Book Management =====");
            System.out.print("1. add book\n2. search book\n3. update book\n4. remove book\n5. display all books\n6. exit\n");
            
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    obj.add(id, title);
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    obj.search(id);
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Book Title: ");
                    title = sc.nextLine();

                    obj.update(id, title);
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();

                    obj.delete(id);
                    break;

                case 5:
                    obj.display();
                    break;

                case 6:
                    exit=true;
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }while(!exit);
    }
}
