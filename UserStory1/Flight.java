public class Flight {
    private int flightId;
    private String departureCity;
    private String arrivalCity;
    private int day;
    private static final int MAX_CAPACITY = 20;

    public Flight(int flightId, String departureCity, String arrivalCity, int day) {
        this.flightId = flightId;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.day = day;
    }

    @Override
    public String toString() {
        return String.format("Flight: %d, departure: %s, arrival: %s, day: %d",
            flightId, departureCity, arrivalCity, day);
    }
}