import java.util.ArrayList;
import java.util.List;

public class FlightSchedule {
    private List<Flight> flights;

    public FlightSchedule() {
        this.flights = new ArrayList<>();
    }

    public void loadSchedule() {
        // Day 1 Flights
        flights.add(new Flight(1, "YUL", "YYZ", 1));
        flights.add(new Flight(2, "YUL", "YYC", 1));
        flights.add(new Flight(3, "YUL", "YVR", 1));

        // Day 2 Flights
        flights.add(new Flight(4, "YUL", "YYZ", 2));
        flights.add(new Flight(5, "YUL", "YYC", 2));
        flights.add(new Flight(6, "YUL", "YVR", 2));
    }

    public void displaySchedule() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
