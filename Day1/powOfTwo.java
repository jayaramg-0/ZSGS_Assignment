public class powOfTwo {
    public static boolean isPowerOfTwo(int n) {
        // Check if n is greater than 0 and (n & (n - 1)) == 0
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(18));
    }
}
