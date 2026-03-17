
package stringproject;

import java.util.Scanner;


public class DuplicateString {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the String : ");
        String str=obj.nextLine();
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            char cr=str.charAt(i);
            arr[i]=cr;
            
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    
}
