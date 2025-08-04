/*4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID,
brand name, and price, such that it can internally keep track of how many vehicles have been created so far,
without requiring manual counting from outside the class. */
class Vehicle {
    static int count = 0;
    int vehicleId;
    String brand;
    double price;

    Vehicle(String brand, double price) {
        this.vehicleId = ++count;
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Honda", 1200000);
        Vehicle v2 = new Vehicle("Toyota", 1400000);
        v1.display();
        v2.display();
        System.out.println("Total vehicles created: " + count);
    }
}