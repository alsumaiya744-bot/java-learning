
package EmailValidator;

public class EmailValidityChecker {
    boolean dot;
    boolean and;
    void mailCheck(String mail)
    {
        for(int i=0;i<mail.length();i++)
        {
            if((mail.charAt(i)==('@')))
            {
                and=true;
            }
            if((mail.charAt(i)==('.')))
            {
                dot=true;
            }
        }
        if((and&&dot)&&(mail.indexOf('@')<(mail.indexOf('.'))))
        {
            System.out.println("valid mail");
        }
        else
        {
            System.out.println("invalid mail");
        }
    }
}
