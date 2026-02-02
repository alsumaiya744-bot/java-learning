package vehicle;

public class Car extends Vehicle{
   int seats;
   Car(String brand,int year,int seats)
   {
       super(brand,year);
       this.seats=seats;
   }
   @Override
   void displayInfo()
   {
       System.out.println("Brand : "+brand);
       System.out.println("Year : "+year);
       System.out.println("Seats : "+seats);
   }
}
