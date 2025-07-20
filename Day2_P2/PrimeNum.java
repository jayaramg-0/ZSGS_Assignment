import java.util.Scanner;
import java.util.Arrays;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered numbers:"+ Arrays.toString(arr));
        System.out.println("Prime numbers are:");
        for (int n : arr) {
            if (n <= 1) continue;
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.print(n + " ");
        }
        sc.close();
    }
}