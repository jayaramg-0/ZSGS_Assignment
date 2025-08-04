// 5. Create a program where try block contains a return statement.
// Ensure that finally block executes before the method returns. Show this with output.
public class Q5_FinallyBeforeReturn {
    public static int testFinally() {
        try {
            System.out.println("Inside try");
            return 10;
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        int result = testFinally();
        System.out.println("Returned value: " + result);
    }
}