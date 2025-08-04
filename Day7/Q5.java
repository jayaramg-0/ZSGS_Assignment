import java.util.*;
// Interface
interface Ticket {
    void bookTicket();
    void cancelTicket();
    void showDetails();
}

// Bus ticket class
class BusTicket implements Ticket {
    private String ticketId;
    private String passengerName;
    private double fare;

    public BusTicket(String ticketId, String passengerName, double fare) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.fare = fare;
    }

    public void bookTicket() {
        System.out.println("Bus ticket booked for " + passengerName + ". Ticket ID: " + ticketId);
    }

    public void cancelTicket() {
        System.out.println("Bus ticket with ID " + ticketId + " has been cancelled.");
    }

    public void showDetails() {
        System.out.println("[Bus] Ticket ID: " + ticketId + ", Name: " + passengerName + ", Fare: $" + fare);
    }
}

// Train ticket class
class TrainTicket implements Ticket {
    private String ticketId;
    private String passengerName;
    private double fare;

    public TrainTicket(String ticketId, String passengerName, double fare) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.fare = fare;
    }

    public void bookTicket() {
        System.out.println("Train ticket booked for " + passengerName + ". Ticket ID: " + ticketId);
    }

    public void cancelTicket() {
        System.out.println("Train ticket with ID " + ticketId + " has been cancelled.");
    }

    public void showDetails() {
        System.out.println("[Train] Ticket ID: " + ticketId + ", Name: " + passengerName + ", Fare: $" + fare);
    }
}

// Flight ticket class
class FlightTicket implements Ticket {
    private String ticketId;
    private String passengerName;
    private double fare;

    public FlightTicket(String ticketId, String passengerName, double fare) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.fare = fare;
    }

    public void bookTicket() {
        System.out.println("Flight ticket booked for " + passengerName + ". Ticket ID: " + ticketId);
    }

    public void cancelTicket() {
        System.out.println("Flight ticket with ID " + ticketId + " has been cancelled.");
    }

    public void showDetails() {
        System.out.println("[Flight] Ticket ID: " + ticketId + ", Name: " + passengerName + ", Fare: $" + fare);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ticket ticket = null;

        System.out.println("Choose transportation mode:");
        System.out.println("1. Bus\n2. Train\n3. Flight\n Enter Your Mode:");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Ticket ID: ");
        String ticketId = sc.nextLine();
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Fare: ");
        double fare = sc.nextDouble();

        switch (choice) {
            case 1:
                ticket = new BusTicket(ticketId, name, fare);
                break;
            case 2:
                ticket = new TrainTicket(ticketId, name, fare);
                break;
            case 3:
                ticket = new FlightTicket(ticketId, name, fare);
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        ticket.bookTicket();
        ticket.showDetails();

        System.out.println("Do you want to cancel the ticket? (yes/no): ");
        sc.nextLine();
        String cancel = sc.nextLine();
        if (cancel.equalsIgnoreCase("yes")) {
            ticket.cancelTicket();
        }

        sc.close();
    }
}
