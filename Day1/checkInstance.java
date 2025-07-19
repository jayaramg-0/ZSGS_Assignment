public class checkInstance {
    public static void main(String[] args) {
        class Vehicle{}
        class Car extends Vehicle{}

        //create objects
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        //Checking instance
        System.out.println("Is vehicle instance of Vehicle: " + (vehicle instanceof Vehicle));
        System.out.println("Is car instance of Car: " + (car instanceof Car));
        System.out.println("Is car instance of Vehicle: " + (car instanceof Vehicle));
        System.out.println("Is vehicle instance of Car: "+ (vehicle instanceof Car));

    }
}
