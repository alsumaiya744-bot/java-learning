
package loggermessageapp;

public class Message extends Thread {
    @Override
    public void run()
    {
        MessageLogger log=MessageLogger.getInstance();
        log.logMessage("hello from thread");
    }
}
