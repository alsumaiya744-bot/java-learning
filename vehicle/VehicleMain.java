package vehicle;

public class VehicleMain {
    public static void main(String[] args) {
     Vehicle v=new Vehicle("Toyota",2022);
     System.out.println("Vehicle Management System");
     System.out.println("----------------------------");
     Car c=new Car ("BMW", 2025, 5);
     c.displayInfo();
     MotorCycle moto=new MotorCycle("Yamaha", 2020,"Sports");
     moto.displayInfo();
    }
}
