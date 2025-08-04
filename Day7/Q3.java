/*Create a Java application to manage employees in a company. Define an abstract class Employee with a method 
calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() 
method based on their working type.
Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee 
reference. */
import java.util.Scanner;

abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Full-time emplyoee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// part-time employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp;

        System.out.println("Enter type of employee: 1. Full Time 2. Part Time");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Name: ");
                String ftName = scanner.nextLine();
                System.out.print("Enter ID: ");
                int ftId = scanner.nextInt();
                System.out.print("Enter Monthly Salary: ");
                double salary = scanner.nextDouble();

                emp = new FullTimeEmployee(ftName, ftId, salary);
                break;

            case 2:
                System.out.print("Enter Name: ");
                String ptName = scanner.nextLine();
                System.out.print("Enter ID: ");
                int ptId = scanner.nextInt();
                System.out.print("Enter Hours Worked: ");
                int hours = scanner.nextInt();
                System.out.print("Enter Rate for hours: ");
                double rate = scanner.nextDouble();

                emp = new PartTimeEmployee(ptName, ptId, hours, rate);
                break;

            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        System.out.println("----------------------------------");
        emp.displayInfo();
        System.out.println("Salary: $" + emp.calculateSalary());

        scanner.close();
    }
}
