
package createaccount;

public class UserService 
{
     public void createAccount(UserInputModel user) throws Exception {

        UserDAO dao = new UserDAO();

        int result = dao.createUser(user);

        if (result > 0) {
            System.out.println("Account created successfully");
        } else {
            System.out.println("Please try again");
        }
    }
}
