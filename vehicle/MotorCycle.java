package vehicle;

public class MotorCycle extends Vehicle {
    String type;

    MotorCycle(String brand,int year,String type) 
    {
        super(brand,year);
        this.type=type;
    }
    @Override
    void displayInfo()
    {
        System.out.println("Brand : "+brand);
        System.out.println("Year : "+year);
        System.out.println("Type : "+type);
    }
}
