/*Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount).
Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. 
Write a main class where you can accept payment using different methods. */


import java.util.Scanner;

//Create the interface
interface PaymentMethod {
    void pay(double amount);
}

//Implement with Credit Card
class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " done using Credit Card.");
    }
}

//Implement with Debit Card
class DebitCardPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " done using Debit Card.");
    }
}

//Implement with UPI
class UPIPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " done using UPI.");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentMethod method = null;

        System.out.println("Welcome to the Payment Gateway \n");
        System.out.print("Enter amount to pay: $");
        double amount = sc.nextDouble();

        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                method = new CreditCardPayment();
                break;
            case 2:
                method = new DebitCardPayment();
                break;
            case 3:
                method = new UPIPayment();
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        method.pay(amount);

        sc.close();
    }
}

