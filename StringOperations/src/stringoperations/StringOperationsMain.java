
package stringoperations;

import java.util.Scanner;

public class StringOperationsMain {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        StringOperations st=new StringOperations();
        boolean exit=false;
        do
        {
            System.out.print("1. String length\n2. Reverse String\n3. String Uppercase\n4. Exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("enter the string : ");
                    String str=obj.nextLine();
                    int len=st.stringLength(str);
                    System.out.println("string length : "+len);
                    break;
                case 2:
                    System.out.println("enter the String : ");
                    String str1=obj.nextLine();
                    String rev=st.stringReverse(str1);
                    System.out.println("String Reverse : "+rev);
                    break;
                case 3:
                    System.out.println("enter the String : ");
                    String str2=obj.nextLine();
                    String upstr=st.stringUpper(str2);
                    System.out.println("lowercase to uppercase : "+upstr);
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
