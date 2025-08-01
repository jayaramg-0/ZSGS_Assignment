package arithmetic;

public class operations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b != 0)
            return (double) a / b;
        else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }

    public int modulo(int a, int b) {
        if (b != 0)
            return a % b;
        else {
            System.out.println("Cannot modulo by zero");
            return 0;
        }
    }
}
