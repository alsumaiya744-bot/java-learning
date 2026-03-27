
package reversethedigit;

import java.util.Scanner;

public class ReverseTheDigit {

    public static void main(String[] args) 
    {
      Scanner obj=new Scanner(System.in);
      System.out.print("enter the number of integers : ");
      int size=obj.nextInt();
      int num[]=new int[size];
      System.out.println("enter the numbers :");
      for(int i=0;i<num.length;i++)
      {
          num[i]=obj.nextInt();
      }
      
     System.out.println("Reverse the digit : ");
     for(int i=size-1;i>=0;i--)
     {
         System.out.println(num[i]);
     }
      
    }
    
}
