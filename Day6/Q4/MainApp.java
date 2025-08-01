import travel.booking.Ticket;
import travel.user.User;

public class MainApp {
    public static void main(String[] args) {
        // Create Ticket
        Ticket t1 = new Ticket("Tk809", "Tokyo", 5000.00);

        // Create User
        User u1 = new User("Eren", "eren@gmail.com");

        // Book the ticket
        u1.bookTicket(t1);
    }
}
