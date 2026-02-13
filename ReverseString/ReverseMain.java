
package ReverseString;
import java.util.Scanner;
public class ReverseMain {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the sentence : ");
        String word=obj.nextLine();
        String[] splitWord=word.split(" ");
        for(int i=0;i<splitWord.length;i++)
        {
            StringBuilder sb=new StringBuilder(splitWord[i]);
            splitWord[i]=sb.reverse().toString();
        }
        String result=String.join(" ", splitWord);
        System.out.println("Rveresed word : "+result);
    }
}
