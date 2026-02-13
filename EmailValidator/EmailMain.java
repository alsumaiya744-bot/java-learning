
package EmailValidator;
import java.util.Scanner;
public class EmailMain {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
        System.out.println("enter your mail : ");
        String mail=obj.next();
        EmailValidityChecker email=new EmailValidityChecker();
        email.mailCheck(mail);
    }   
}
