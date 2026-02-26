
package loggermessageapp;

public class MessageLogger {
    private static MessageLogger logger;

    private MessageLogger() {
        System.out.println("logger created");
    }
    public static synchronized MessageLogger getInstance()
    {
        if(logger==null)
        {
            logger=new MessageLogger();
        }
        return logger;
    }
    void logMessage(String msg)
    {
        System.out.println(Thread.currentThread().getName()+" : "+msg);
    }
}
