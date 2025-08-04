// 8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
// --->Create a class Student with fields like name, rollNo, and department.
// --->Attempt to clone an object of this class using the clone() method.
// --->Catch and handle the CloneNotSupportedException if thrown.
// ***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
// -->Your program should clearly illustrate:
// a. What happens if Cloneable is not implemented
// b. How the error is resolved by implementing Cloneable

class Student implements Cloneable {
    String name;
    int rollNo;
    String department;

    Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return name + ", " + rollNo + ", " + department;
    }
}

public class Q8_CloneStudentExample {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101, "CS");
        try {
            Student s2 = (Student) s1.clone();
            System.out.println("Original: " + s1);
            System.out.println("Cloned: " + s2);
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException caught: " + e);
        }
    }
}