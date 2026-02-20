
package laptopdetails;


import java.util.ArrayList;
import java.util.Scanner;

public class LaptopDetails {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      String laptopModel=null;
      String color=null;
      boolean rgb=false;
      String processor=null;
      double price=0;
      
      ArrayList <Acer> as =new ArrayList();
      boolean exit=false;
      do
      {
          System.out.print("1. Entry for Laptop\n2. search about Laptop\n3. exit\n");
          System.out.println("enter your choice : ");
          int choice=obj.nextInt();
          obj.nextLine();
          switch(choice)
          {
              case 1:
                  System.out.println("enter the model of laptop : ");
                  laptopModel=obj.nextLine();
                  System.out.println("enter the color of the laptop : ");
                  color=obj.nextLine();
                  System.out.println("it is rgb keyboard (True/False) : ");
                  rgb=obj.nextBoolean();
                  obj.nextLine();
                  System.out.println("enter the name of the processor : ");
                  processor=obj.nextLine();
                  System.out.println("enter the price : ");
                  price=obj.nextDouble();
                  Acer laptop=new Acer(laptopModel, color, rgb, processor, price);
                  
                  as.add(laptop);
                  break;
                  
              case 2:
                  System.out.println("enetr the laptop name : ");
                  String lapName=obj.nextLine();
                  for(Acer lap:as)
                  {
                     if(lap.laptopModel.equals(lapName))
                     {
                        System.out.println("------------------------------");
                        System.out.println("Laptop Name : "+lap.laptopModel);
                        System.out.println("Color of the laptop : "+lap.color);
                        System.out.println("it is rgb laptop : "+lap.rgb);
                        System.out.println("Processor : "+lap.processor);
                        System.out.println("Price of the laptop : "+lap.price);
                        System.out.println("------------------------------");
                     }
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
