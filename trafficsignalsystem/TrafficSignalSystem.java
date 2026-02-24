
package trafficsignalsystem;
import java.util.Scanner;
public class TrafficSignalSystem {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        TrafficLights light=new TrafficLights();
        boolean exit=false;
        do
        {
            System.out.print("1. show signal meaning\n2. check stop or go\n3. exit\n");
            System.out.println("enter your choice : ");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 1:
                   light.signalMeaning();
                   break;
                case 2:
                    try
                    {
                        System.out.println("enter the color to check signal : ");
                        String lights=obj.next();
                        light.checkSignal(lights);
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e);
                    }
                        break;
                case 3:
                    System.out.println("Thank You");
                    exit=true;
                    break;
                default:
                    System.out.println("invalid choice");
                            
            }
        }while(!exit);
    }
    
}
