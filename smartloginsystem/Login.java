
package smartloginsystem;

import javax.security.auth.login.AccountLockedException;

public class Login {
    final String USER_NAME;
    final String password;
    int attempt;

    public Login(String USER_NAME, String password) {
        this.USER_NAME = USER_NAME;
        this.password = password;
    }
    void login(String name,String password) throws AccountLockedException
    {
         if(attempt==3)
         {
             throw new AccountLockedException("Maximum attempt is 3");
         }
         else
         {
            if(USER_NAME.equals(name))
            {
                if(this.password.equals(password))
                {
                    System.out.println("Successfully Logged in");
                }
                else
                {
                    System.out.println("incorrect password");
                    attempt++;
                }
            }
            else
            {
                System.out.println("incorrect user name");
                attempt++;
            }
         }
    }
}
