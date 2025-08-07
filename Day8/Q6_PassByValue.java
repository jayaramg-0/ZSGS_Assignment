//  Develop a Java program to illustrate pass-by-value
public class Q6_PassByValue {
    public static void modify(int num) {
        num = num + 100;
    }

    public static void main(String[] args) {
        int x = 50;
        // System.out.println("Before " + x );
        modify(x);
        System.out.println("Value of x after modify: " + x); // x is unchanged
    }
}