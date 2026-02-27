
package notificationsystem;

public abstract class NotificationFactory {
    abstract Notification createNotification();
    void send()
    {
        Notification note=createNotification();
        note.sendMessage();
        System.out.println("Message sended successfully");
    }
}
