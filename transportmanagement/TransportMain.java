package transportmanagement;
import java.util.Scanner;
public class TransportMain {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       boolean exit=false;
       System.out.println("Enter passenger ID : ");
       int passengerID=obj.nextInt();
       obj.nextLine();
       System.out.println("Enter passenger Name : ");
       String passengerName=obj.nextLine();
       System.out.println("Select Route : ");
       System.out.print("1. Chennai->Bangalore\n2. Chennai->Coimbatore\n3. Chennai->Madurai\n4. Channai->Trichy\n5. Chennai->Salem\n");
       System.out.println("enter your choice : ");
       int choice=obj.nextInt();
       String fromCity = null;
       String toCity=null;
       int distance=0;
       switch(choice)
       {
           case 1:
               fromCity="Chennai";
               toCity="Bengalore";
               distance=350;
               break;
            case 2:
               fromCity="Chennai";
               toCity="Coimbature";
               distance=500;
               break;
            case 3:
               fromCity="Chennai";
               toCity="Madurai";
               distance=460;
               break;
            case 4:
               fromCity="Chennai";
               toCity="Trichy";
               distance=330;
               break;
            case 5:
               fromCity="Chennai";
               toCity="Salem";
               distance=340;
               break;
       }
       double fare=0.0;
       boolean cityBooking=false;
       boolean luxuryBooking=false;
       CityBusBooking city=new CityBusBooking(passengerID, passengerName, fromCity, toCity, distance);
       LuxuryBusBooking luxury=new LuxuryBusBooking(passengerID, passengerName, fromCity, toCity, distance);
       do
       {
           System.out.println("---- TRANSPORT MANANGEMENT SYSTEM ----");
           System.out.print("1. city bus booking\n2. luxury bus booking\n3. calculate fare\n4. display ticket\n5. exit\n");
           System.out.println("enter your choice : ");
           int option=obj.nextInt();
           switch(option)
           {
               case 1:
                   city.booking();
                   cityBooking=true;
                   break;
               case 2:
                   luxury.booking();
                   luxuryBooking=true;
                   break;
               case 3:
                   if(cityBooking)
                   {
                      fare=city.calculateFare();
                      
                   }
                   else
                   {
                      fare=luxury.calculateFare();
                   }
                   break;
               case 4:
                   if(cityBooking)
                   {
                       city.displayTicket(fare);
                   }
                   else
                   {
                       luxury.displayTicket(fare);
                   }
                   break;
               case 5 :
                   System.out.println("Thank You");
                   exit=true;
                   break;
               default :
                   System.out.println("Invalis Choice");
           }
       }while(!exit);
    }
    
}
