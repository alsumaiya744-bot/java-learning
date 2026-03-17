package stringproject;

import java.util.Scanner;

public class StringFrequency {
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
            boolean visited=false;
            
            for(int k=0;k<i;k++)
            {
                if(arr[i]==arr[k])
                {
                    visited=true;
                    break;
                }
            }
            
            if(visited)
            
                continue;
                int count=1;
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;


                    }

                }
                System.out.println(arr[i]+":"+count);
            
            
            
        }
    }
}
