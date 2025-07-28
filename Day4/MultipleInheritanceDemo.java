class A {
    public void displayA() {
        System.out.println("Class A method");
    }
}

class B {
    public void displayB() {
        System.out.println("Class B method");
    }
}

// This will cause a compile-time error in Java
// class C extends A, B { // Error: multiple inheritance not allowed
//     public void displayC() {
//         System.out.println("Class C method");
//     }
// }
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        System.out.println("Java does not support multiple inheritance with classes.");
        System.out.println("Uncommenting 'class C extends A, B' will cause a compile-time error.");
    }
}