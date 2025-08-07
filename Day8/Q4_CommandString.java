//  Get some strings through the command-line prompt and use an array to store and display them
public class Q4_CommandString {
    public static void main(String[] args) {
        // Check if arguments are passed
        if (args.length == 0) {
            System.out.println("No strings entered. Please pass strings as command-line arguments.");
            return;
        }

        // Store and display the strings
        System.out.println("You entered the following strings:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("String " + (i + 1) + ": " + args[i]);
        }
    }
}
