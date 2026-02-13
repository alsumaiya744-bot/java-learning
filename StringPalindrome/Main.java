
package StringPalindrome;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a word : ");
        String word=obj.nextLine();
        Palindrome pali =new Palindrome();
        pali.checkPalindrome(word);
    }
}
