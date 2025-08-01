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
