
package usersessionsingleton;

public class UserSessionSingleton {

    public static void main(String[] args) {
        UserSession u1=UserSession.createSession();
        UserSession u2=UserSession.createSession();
        u1.setUser("safa");
        u2.ShowUserName();
        System.out.println(u1==u2);
    }
    
}
