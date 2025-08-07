// 5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.
class Person implements Cloneable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Q5_CloneExample {
    public static void main(String[] args) {
        try {
            Person p1 = new Person("Deva", 25);
            Person p2 = (Person) p1.clone();
            System.out.println(p1.name + " " + p1.age);
            System.out.println(p2.name + " " + p2.age);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}