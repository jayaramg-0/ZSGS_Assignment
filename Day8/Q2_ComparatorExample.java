import java.util.*;
// 2. Develop a Java program which illustrates the usage of Comparator Interface.
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return rollNo + " " + name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Q2_ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(2, "John"));
        list.add(new Student(1, "Alice"));

        Collections.sort(list, new NameComparator());

        for (Student s : list) {
            System.out.println(s);
        }
    }
}