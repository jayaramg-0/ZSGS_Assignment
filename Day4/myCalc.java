// package Day4;

class basicCalculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
class AdvancedCalculator extends basicCalculator {
    public double squareRoot(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number.");
        }
        return Math.sqrt(a);
    }
    
    public int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a % b;
    }
}
class ScientificCalculator extends AdvancedCalculator {
    public double sine(double angle) {
        return Math.sin(Math.toRadians(angle));
    }
    
    public double cosine(double angle) {
        return Math.cos(Math.toRadians(angle));
    }
    
    public double log(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Logarithm of non-positive number is undefined.");
        }
        return Math.log(value);
    }
    public double exponential(double value) {
        return Math.exp(value);
    }
}

public class myCalc {
    public static void main(String[] args) {
        ScientificCalculator calc = new ScientificCalculator();
        
        // Basic operations
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Division: " + calc.divide(6, 3));
        
        // Advanced operations
        System.out.println("Square Root: " + calc.squareRoot(16));
        System.out.println("Power: " + calc.power(2, 3));
        System.out.println("Modulus: " + calc.modulus(5, 3));
        
        // Scientific operations
        System.out.println("Sin of 30 degrees: " + calc.sine(30));
        System.out.println("Cosin of 60 degrees: " + calc.cosine(60));
        System.out.println("Log of 10: " + calc.log(10));
        System.out.println("Exponential of 1: " + calc.exponential(1));
    }
}
