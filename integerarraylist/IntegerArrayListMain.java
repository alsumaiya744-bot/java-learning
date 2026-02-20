
package integerarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerArrayListMain {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int num;
       ArrayList <Integer> ai=new ArrayList();
      
       boolean exit=false;
       do
       {
           System.out.print("1. Enter\n2. Exit\n");
           System.out.println("enter your choice : ");
           
           int choice=obj.nextInt();
           switch(choice)
           {
               case 1:
                   System.out.println("enter the number : ");
                   num=obj.nextInt();
                   
                   ai.add(num);
                   
                   break;
               case 2:
                   
                   IntegerArrayList.sum(ai);
                   System.out.println("Thank You");
                   exit=true;
                   break;
               default :
                   System.out.println("invalid choice");
           }
       }while(!exit);
    }
    
}
