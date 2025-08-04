// 1. int[] arr = {2, 5, 1, 4, 0, 7};
// int quotient = arr[7] / arr[4];
// Develop a Java program which handles any unexpected situations that may arise during execution.
public class Q1_HandleArrayException {
    public static void main(String[] args) {
        try {
            int[] arr = {2, 5, 1, 4, 0, 7};
            int quotient = arr[7] / arr[4];
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e);
        } catch (Exception e) {
            System.out.println("General error: " + e);
        }
    }
}