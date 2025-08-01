package travel.booking;

public class Ticket {
    private String ticketId;
    private String destination;
    private double fare;

    // Constructor
    public Ticket(String ticketId, String destination, double fare) {
        this.ticketId = ticketId;
        this.destination = destination;
        this.fare = fare;
    }

    // Getters
    public String getTicketId() {
        return ticketId;
    }

    public String getDestination() {
        return destination;
    }

    public double getFare() {
        return fare;
    }

    // Display method (optional)
    public void displayTicket() {
        System.out.println("Ticket ID     : " + ticketId);
        System.out.println("Destination   : " + destination);
        System.out.println("Fare          : $" + fare);
    }
}
