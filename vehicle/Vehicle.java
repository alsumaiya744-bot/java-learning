package vehicle;

public class Vehicle {
   String brand;
   int year;
   Vehicle(String brand,int year)
   {
       this.brand=brand;
       this.year=year;
   }
   void displayInfo()
   {
       System.out.println("Brand : "+brand);
       System.out.println("Year : "+year);
   }
}
