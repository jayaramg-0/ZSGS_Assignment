/* Design a class named`BankAccount that uses the concept of encapsulation. 
The class should have the following private data members: account number, account holder name, and balance. 
Provide public getter and setter methods to access and modify these fields.
Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative. */

import java.util.Scanner;

public class Q5 {
    // Private data members
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Setters & Getters
    public void setAccountNumber(String accNum) {
        this.accountNumber = accNum;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public void setBalance(double amount) {
        if (amount >= 0)
            this.balance = amount;
        else
            System.out.println("Initial balance can't be negative.");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount should be positive.");
        } else if (amount > balance) {
            System.out.println("Not enough balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        }
    }

    // Display account summary
    public void displayAccount() {
        System.out.println("\n----- Account Summary -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Current Balance: $" + balance);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q5 acc = new Q5();

        // Input account details
        System.out.print("Enter account number: ");
        acc.setAccountNumber(sc.nextLine());

        System.out.print("Enter account holder name: ");
        acc.setAccountHolderName(sc.nextLine());

        System.out.print("Enter initial balance: ₹");
        acc.setBalance(sc.nextDouble());

        // Menu loop
        int choice;
        do {
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;
                case 3:
                    acc.displayAccount();
                    break;
                case 4:
                    System.out.println("Thank you! Visit again.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
