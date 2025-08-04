import java.util.*;
// 2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, 
// and perform division, and catch the following exceptions: InputMismatchException,
//  NumberFormatException, ArithmeticException and Exception.
public class Q2_MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            String s1 = scanner.next();
            System.out.print("Enter second number: ");
            String s2 = scanner.next();

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        } catch (Exception e) {
            System.out.println("Other error: " + e);
        }
    }
}