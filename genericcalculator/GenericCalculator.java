
package genericcalculator;

import java.util.Scanner;

public class GenericCalculator {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       boolean exit=false;
       do
       {
           System.out.print("1. Add\n2. Subtract\n3. exit\n");
           int choice=obj.nextInt();
           switch(choice)
           {
               case 1:
                   System.out.print("1.Add integer\n2. Add double\n");
                   int choice1=obj.nextInt();
                   if(choice1==1)
                   {
                       System.out.println("enter the num1 : ");
                       int num1=obj.nextInt();
                       System.out.println("enter the num2 : ");
                       int num2=obj.nextInt();
                       Calculator<Integer> ca=new Calculator<>();
                       ca.addInt(num1, num2);
                   }
                   else if(choice1==2)
                   {
                       System.out.println("enter the num1 : ");
                       double num1=obj.nextInt();
                       System.out.println("enter the num2 : ");
                       double num2=obj.nextInt();
                       Calculator<Double> ca=new Calculator<>();
                       ca.addDouble(num1, num2);
                   }
                   break;
               case 2:
                   System.out.print("1.Add integer\n2. Add double\n");
                   int choice2=obj.nextInt();
                   if(choice2==1)
                   {
                       System.out.println("enter the num1 : ");
                       int num1=obj.nextInt();
                       System.out.println("enter the num2 : ");
                       int num2=obj.nextInt();
                       Calculator<Integer> ca=new Calculator<>();
                       ca.subInt(num1, num2);
                   }
                   else if(choice2==2)
                   {
                       System.out.println("enter the num1 : ");
                       double num1=obj.nextInt();
                       System.out.println("enter the num2 : ");
                       double num2=obj.nextInt();
                       Calculator<Double> ca=new Calculator<>();
                       ca.addDouble(num1, num2);
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
