
package trafficsignalsystem;

public class TrafficLights {
    Signal status;
    void signalMeaning()
    {
        System.out.println(status.RED+" - stop");
        System.out.println(status.YELLOW+" - wait");
        System.out.println(status.GREEN+" - go");
    }
    void checkSignal(String light)throws IllegalArgumentException
    {
       
        String s=light.toUpperCase();
       Signal sg=Signal.valueOf(s);
       if(sg==Signal.RED)
       {
           System.out.println("stop");
       }
       else if(sg==Signal.YELLOW)
       {
           System.out.println("wait and ready to go");
       }
       else if(sg==Signal.GREEN)
       {
           System.out.println("go");
       }
       else if(sg!=(Signal.RED)|| sg!=(Signal.YELLOW)||sg!=(Signal.GREEN))
       {
           System.out.println("there is no signal color like you enterd");
       }
       else 
       {
           throw new IllegalArgumentException("please enter string value only");
       }
    }
}
