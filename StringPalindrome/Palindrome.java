
package StringPalindrome;

public class Palindrome {
    String rev="";
    void checkPalindrome(String word)
    {
        for(int i=word.length()-1;i>=0;i--)
        {
            rev=rev+word.charAt(i);
        }
        if(word.equals(rev))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
    
}
