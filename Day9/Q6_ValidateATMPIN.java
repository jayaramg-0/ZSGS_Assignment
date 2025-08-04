import java.util.Scanner;
// 6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
// --->It must be exactly 4 digits long.
// --->It should contain only numeric characters.
// --->It must not start with 0.
// Display an appropriate message whether the PIN is valid or invalid.
public class Q6_ValidateATMPIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4-digit ATM PIN: ");
        String pin = scanner.next();

        if (pin.length() != 4 || !pin.matches("\\d{4}") || pin.startsWith("0")) {
            System.out.println("Invalid PIN");
        } else {
            System.out.println("PIN is valid");
        }
    }
}