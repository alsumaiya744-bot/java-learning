package transportmanagement;
public abstract class Transport {
    private int passengerID;
    private String passengerName;
    private String fromCity;
    private String toCity;
    int distance;
    double fare;
    Transport(int passengerID,String passengerName,String fromCity,String toCity,int distance)
    {
        this.passengerID=passengerID;
        this.passengerName=passengerName;
        this.fromCity=fromCity;
        this.toCity=toCity;
        this.distance=distance;
    }
    abstract double calculateFare();
    void displayTicket(double fare)
    {
        System.out.println("---- TICKET DETAILS ----");
        System.out.println("Passenger ID : "+passengerID);
        System.out.println("Passenger Name : "+passengerName);
        System.out.println("Route : "+fromCity+"->"+toCity);
        System.out.println("Distance : "+distance);
        System.out.println("Total Fare : "+fare);
    }
}
