
package usersessionsingleton;

public class UserSession {
    private static UserSession user;
    private String userName;

    private UserSession() {
        System.out.println("user session is created");
    }
    public static UserSession createSession()
    {
        if(user==null)
        {
            user=new UserSession();
        }
        return user;
    }
    void setUser(String userName)
    {
        this.userName=userName;
    }

    public void ShowUserName() {
        System.out.println("user name : "+userName);
    }
    
}
