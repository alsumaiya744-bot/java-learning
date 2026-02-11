
package LinkedList;
import java.util.Scanner;
public class LinkedMain {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        InsertionAndDeletion in = new InsertionAndDeletion();
        in.insert(10);
        in.insert(20);
        in.insert(30);
        in.insert(40);
        in.insert(50);
        in.insert(60);
   
        in.display();
        System.out.println("enter element to delete : ");
        int key=obj.nextInt();
        in.delet(key);
        in.display();
    }
}
