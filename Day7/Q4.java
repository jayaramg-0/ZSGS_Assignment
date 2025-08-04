// Define the interface
interface Employee {
    double calculateSalary();
    void displayInfo();
}

// Full-Time Employee implementation
class FullTimeEmployee implements Employee {
    private String name;
    private int id;
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Full-Time Employee");
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Part-Time Employee implementation
class PartTimeEmployee implements Employee {
    private String name;
    private int id;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Part-Time Employee");
        System.out.println("ID: " + id + ", Name: " + name);
    }
}


public class Q4 {
    public static void main(String[] args) {
        Employee emp;

        emp = new FullTimeEmployee("Jayaram", 101, 50000);
        emp.displayInfo();
        System.out.println("Salary: $" + emp.calculateSalary());
        System.out.println("--------------------------");

        emp = new PartTimeEmployee("Ram", 102, 80, 250);
        emp.displayInfo();
        System.out.println("Salary: $" + emp.calculateSalary());
    }
}
