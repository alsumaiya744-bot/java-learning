
package markmanagementsystem;

import java.util.Scanner;

public class MarkManagementSystem {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter mark count : ");
        int size=obj.nextInt();
        Mark m=new Mark(size);
        boolean exit=false;
        do
        {
            System.out.println("1. Enter Student Marks\n2. Display Marks\n3. exit");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                    try
                    {
                        System.out.println("enter student mark : ");
                        int mark=obj.nextInt();
                        m.addMark(mark);
                    }
                    catch(IllegalArgumentException ill)
                    {
                        System.out.println(ill.getMessage());
                    }
                    catch(ArrayIndexOutOfBoundsException arr)
                    {
                        System.out.println(arr.getMessage());
                    }
                    break;
                case 2:
                    m.display();
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
