
// 3. Write a program to illustrate how to throw a ClassNotFoundException.
public class Q3_ClassNotFoundExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.unknown.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
        }
    }
}