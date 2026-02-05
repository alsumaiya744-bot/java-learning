package transportmanagement;
public class CityBusBooking extends Transport {

    public CityBusBooking(int passengerID, String passengerName, String fromCity, String toCity, int distance) {
        super(passengerID, passengerName, fromCity, toCity, distance);
    }
    void booking()
    {
        System.out.println("Ticket booked successfully");
    }
    @Override
    double calculateFare() {
        fare=distance*5;
        return fare;
    }
    
}
