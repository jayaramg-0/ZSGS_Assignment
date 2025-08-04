/*3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees. */
class Employee {
    String name, designation;
    int empId;
    double salary;

    Employee() {
        System.out.println("Default constructor called");
        name = "Default";
        empId = 0;
        designation = "None";
        salary = 0.0;
    }

    Employee(String name, int empId, String designation, double salary) {
        this.name = name;
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;
    }

    Employee(Employee e) {
        this.name = e.name;
        this.empId = e.empId;
        this.designation = e.designation;
        this.salary = e.salary;
    }

    void display() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID : " + empId);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Jayaram", 101, "Manager", 85000);
        Employee e3 = new Employee(e2);

        e1.display();
        e2.display();
        e3.display();
    }
}