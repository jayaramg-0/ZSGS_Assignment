// 10. Write a Java program to manage a voting system where a person must be at least 18 years old to be 
// eligible to vote. 
// Use a custom exception to handle the scenario when an ineligible person tries to register for voting. 
// Display appropriate messages for eligible and ineligible voters.
import java.util.Scanner;
class NotEligibleToVoteException extends Exception {
    public NotEligibleToVoteException(String message) {
        super(message);
    }
}

public class Q10_VotingSystemWithException {
    public static void checkEligibility(int age) throws NotEligibleToVoteException {
        if (age < 18) {
            throw new NotEligibleToVoteException("You must be at least 18 to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        try {
            checkEligibility(age);
            System.out.println("You are eligible to vote.");
        } catch (NotEligibleToVoteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}