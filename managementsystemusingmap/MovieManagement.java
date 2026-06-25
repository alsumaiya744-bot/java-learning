package managementsystemusingmap;

import java.util.HashMap;
import java.util.Scanner;


public class MovieManagement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> movies = new HashMap<>();

        MapOperations<String, Double> obj = new MapOperations<>(movies);
        boolean exit=false;
        int choice;

       do {

            System.out.println("===== Movie Rating Management =====");
            System.out.print("1. add movie\n2. search movie\n3. update rating\n4. delete movie\n5. display all movie\n6. exit\n");
            
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Movie Name: ");
                    String movie = sc.nextLine();
                    System.out.print("Enter Rating: ");
                    double rating = sc.nextDouble();
                    obj.add(movie, rating);
                    break;

                case 2:
                    System.out.print("Enter Movie Name: ");
                    movie = sc.nextLine();
                    obj.search(movie);
                    break;

                case 3:
                    System.out.print("Enter Movie Name: ");
                    movie = sc.nextLine();

                    System.out.print("Enter New Rating: ");
                    rating = sc.nextDouble();
                    obj.update(movie, rating);
                    break;

                case 4:
                    System.out.print("Enter Movie Name: ");
                    movie = sc.nextLine();
                    obj.delete(movie);
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
