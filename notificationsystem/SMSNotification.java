
package notificationsystem;

public class SMSNotification implements Notification{

    @Override
    public void sendMessage() {
        System.out.println("Sending SMS notification.........");
    }
    
}
