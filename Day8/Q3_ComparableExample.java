import java.util.*;
// 3. Develop a Java program which illustrates the usage of Comparable Interface.
class Student implements Comparable<Student> {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.rollNo - s.rollNo;
    }

    public String toString() {
        return rollNo + " " + name;
    }
}

public class Q3_ComparableExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Mark"));
        list.add(new Student(1, "Bob"));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s);
        }
    }
}