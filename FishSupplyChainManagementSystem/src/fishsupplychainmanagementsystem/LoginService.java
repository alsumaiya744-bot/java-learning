
package fishsupplychainmanagementsystem;

public class LoginService 
{
    public LoginModel getUser(String username) throws Exception
    {
        LoginDAO dao = new LoginDAO();
        return dao.getUser(username);
    }

    public void deleteUser(String username) throws Exception 
    {

        LoginDAO dao = new LoginDAO();

        int result = dao.deleteUser(username);

        if (result > 0) 
        {
            System.out.println("User deleted successfully");
        } 
        else
        {
            System.out.println("User not found");
        }
    }
}
