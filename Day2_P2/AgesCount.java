import java.util.Scanner;
public class AgesCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        int below18 = 0, between = 0, above60 = 0;
        System.out.println("Enter ages of 10 people:");
        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
            if (age[i] < 18) below18++;
            else if (age[i] <= 60) between++;
            else above60++;
        }
        System.out.println("People Below age 18: " + below18);
        System.out.println("People that age is 18 to 60: " + between);
        System.out.println("People above age 60: " + above60);
        sc.close();
    }
}