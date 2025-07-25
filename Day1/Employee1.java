public class Employee1 {
    // Instance variables
    private int empId;
    private String name;
    private String department;
    private double salary;

    // Parameterized constructor
    public Employee1(int empId, String name, String department, double salary) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object
        Employee1 emp = new Employee1(101, "Jayaram", "Developer", 80000.00);
        Employee1 emp2 = new Employee1(102, "Ram Kumar", "Tester", 75000.00);
        // Displaying employee details
        emp.displayDetails();
        emp2.displayDetails();
    }
}