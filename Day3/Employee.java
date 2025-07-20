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