
package stingproject;
import java.util.Scanner;
public class StingProject {

    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter the sentence : ");
        String sentence=obj.nextLine();
        boolean exit=false;
        SentenceCount sent=new SentenceCount();
        do
        {
            System.out.print("1. charater cout\n2. word count\n3. vowel count\n4. exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                   sent.charCount(sentence);
                   break;
                case 2:
                    sent.wordCount(sentence);
                    break;
                case 3:
                    sent.vowelCount(sentence);
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
