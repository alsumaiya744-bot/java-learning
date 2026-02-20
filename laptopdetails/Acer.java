
package laptopdetails;

import java.util.ArrayList;

public class Acer {
    String laptopModel;
    String color;
    boolean rgb;
    String processor;
    double price;

      
    public Acer(String laptopModel, String color, boolean rgb, String processor, double price) {
        this.laptopModel = laptopModel;
        this.color = color;
        this.rgb = rgb;
        this.processor = processor;
        this.price = price;
    }
    
   
    void search(String lapName)
    {
        for(Acer lap:as)
        {
            if(lap.laptopModel.equals(lapName))
            {
                System.out.println("------------------------------");
                System.out.println("Laptop Name : "+laptopModel);
                System.out.println("Color of the laptop : "+color);
                System.out.println("it is rgb laptop : "+rgb);
                System.out.println("Processor : "+processor);
                System.out.println("Price of the laptop : "+price);
                System.out.println("------------------------------");
            }
        }
    }
}
