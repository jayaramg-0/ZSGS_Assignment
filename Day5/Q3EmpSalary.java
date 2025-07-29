class Employee {
    int EmpId;
    String name;

    Employee(int EmpId, String name) {
        this.EmpId = EmpId;
        this.name = name;
    }

    double CalcSalary() {
        return 0;
    }

    void display() {
        System.out.println("Employee Id :" + EmpId);
        System.out.println("Employee Name :" + name);
    }

}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(int EmpId, String name, double salary) {
        super(EmpId, name);
        this.monthlySalary = salary;
    }

    @Override
    double CalcSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double WorkHours;
    double WorksRate;

    PartTimeEmployee(int EmpId, String name, double hour, double rate) {
        super(EmpId, name);
        this.WorkHours = hour;
        this.WorksRate = rate;
    }

    @Override
    double CalcSalary() {
        return WorkHours * WorksRate;
    }
}

public class Q3EmpSalary {
    public static void main(String arg[]) {
        FullTimeEmployee emp1 = new FullTimeEmployee(101, "Jayaram", 98000);
        PartTimeEmployee emp2 = new PartTimeEmployee(102, "Ram Kumar",90,600);

        emp1.display();
        System.out.println("Salary: " + emp1.CalcSalary());
        System.out.println("--------------------------------");

        emp2.display();
        System.out.println("Salary: " + emp2.CalcSalary());
    }
}
