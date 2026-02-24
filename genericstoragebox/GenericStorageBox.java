
package genericstoragebox;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GenericStorageBox {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        StorageBox<Integer> in=new StorageBox<>();
        StorageBox<String> st=new StorageBox<>();
        int size;
        boolean exit=false;
        do
        {
            System.out.println("====== MENU ======");
            System.out.print("1. store integer\n2. store string\n3. display value\n4. exit\n");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("enter the size of value : ");
                    size=obj.nextInt();
                    System.out.println("enter the value : ");
                    Integer values[]=new Integer[size];
                    for(int i=0;i<values.length;i++)
                    {
                        values[i]=obj.nextInt();
                        in.addValues(values);
                    }
                    System.out.println("value added successfully");
                    
                    
                    break;
                case 2:
                    try
                    {    
                        System.out.println("enter the size of value : ");
                        size=obj.nextInt();
                        obj.nextLine();
                        System.out.println("enter the value : ");
                        String value[]=new String[size];
                        for(int i=0;i<value.length;i++)
                        {
                            value[i]=obj.nextLine();
                            st.addValues(value);
                        }
                        System.out.println("value added successfully");
                        
                    }
                    catch(InputMismatchException e)
                    {
                        System.out.println("you entered wrong input");
                    }
                    break;
                case 3:
                    System.out.print("1. display interger\n2. display string\n");
                    System.out.println("enter your choice : ");
                    int option=obj.nextInt();
                    if(option==1)
                    {
                        in.display();
                    }
                    else
                    {
                        st.display();
                    }
                    break;
                case 4:
                    System.out.println("Thank You");
                    exit=true;
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }while(!exit);
    }
    
}
