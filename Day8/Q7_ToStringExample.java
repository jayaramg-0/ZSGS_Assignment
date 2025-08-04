// 7. Develop a Java program to illustrate the usage of toString() method.
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String toString() {
        return "Model: " + model + ", Year: " + year;
    }
}

public class Q7_ToStringExample {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 2022);
        System.out.println(car);
    }
}