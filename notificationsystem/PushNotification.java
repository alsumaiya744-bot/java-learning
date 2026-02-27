
package notificationsystem;

public class PushNotification implements Notification{

    @Override
    public void sendMessage() {
        System.out.println("Sending Push notification");
    }
    
}
