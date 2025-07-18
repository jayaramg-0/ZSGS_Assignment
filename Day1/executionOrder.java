public class executionOrder {

    // Static block
    static {
        System.out.println("Static block executed");
    }

    // Initializer block
    {
        System.out.println("Initializer block executed");
    }

    // Constructor
    public executionOrder() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        // Creating the first object
        executionOrder obj1 = new executionOrder();

        // Creating the second object
        executionOrder obj2 = new executionOrder();

        System.out.println("Main method ended");
    }
}
