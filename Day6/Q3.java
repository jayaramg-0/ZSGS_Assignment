class Employee {
    // Private variables
    private int empId;
    private String name;
    private String designation;
    private String department;
    private double monthlySalary;

    //Getters and Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            System.out.println("Invalid salary value!");
        }
    }

    //Annual salary
    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    // Display
    public void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Name          : " + name);
        System.out.println("Designation   : " + designation);
        System.out.println("Department    : " + department);
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setName("Suresh");
        emp.setDesignation("Software Engineer");
        emp.setDepartment("IT");
        emp.setMonthlySalary(50000);

        emp.displayDetails();
    }
}


