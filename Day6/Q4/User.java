package travel.user;

import travel.booking.Ticket;

public class User {
    private String userName;
    private String email;

    // Constructor
    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    // Method to book ticket
    public void bookTicket(Ticket t) {
        System.out.println("User: " + userName + " (" + email + ") has booked the ticket:");
        t.displayTicket();  // accessing Ticket data
    }
}
