import java.util.Scanner;
public class sumOfOdd {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0) sum += arr[i];
        }
        System.out.println("Sum of odd numbers: " + sum);
        sc.close();
    }
}