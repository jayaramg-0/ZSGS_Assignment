// 7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls 
// method3, which throws the exception).
// Handle the exception in method1.
public class Q7_ExceptionPropagation {
    static void method3() {
        throw new ArithmeticException("Exception in method3");
    }

    static void method2() {
        method3();
    }

    static void method1() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Caught in method1: " + e);
        }
    }

    public static void main(String[] args) {
        method1();
    }
//     main() -> calls method1()

// method1() -> calls method2()

// method2() -> calls method3()

// method3() -> throws ArithmeticException

// Exception moves backward: method3 -> method2 -> method1

// method1() has a catch, so it catches the exception
}