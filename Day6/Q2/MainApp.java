/*Create a Java application that demonstrates the use of user-defined packages by organising classes based on their 
functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two 
numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods. */
import arithmetic.operations;
import stringutils.StringUtils;

public class MainApp {
    public static void main(String[] args) {
        operations op = new operations();
        StringUtils su = new StringUtils();

        int a = 20, b = 10;

        System.out.println("----- Arithmetic Operations -----");
        System.out.println("Addition: " + op.add(a, b));
        System.out.println("Subtraction: " + op.subtract(a, b));
        System.out.println("Multiplication: " + op.multiply(a, b));
        System.out.println("Division: " + op.divide(a, b));
        System.out.println("Modulo: " + op.modulo(a, b));

        String str1 = "Hello";
        String str2 = "World";

        System.out.println("\n----- String Utilities -----");
        System.out.println("Concatenation: " + su.concatenate(str1, str2));
        System.out.println("Reversed: " + su.reverse(str1));
        System.out.println("Length: " + su.getLength(str1));
    }
}
