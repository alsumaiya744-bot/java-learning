package transportmanagement;
public class LuxuryBusBooking extends Transport {

    public LuxuryBusBooking(int passengerID, String passengerName, String fromCity, String toCity, int distance) {
        super(passengerID, passengerName, fromCity, toCity, distance);
    }
    void booking()
    {
        System.out.println("Ticket booked successfully");
    }
    @Override
    double calculateFare() {
        fare=(distance*10)+200;
        return fare;
    }
    
}
