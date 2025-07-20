import java.util.Scanner;
public class GetRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[10][3];
        int[] roll = new int[10];
        System.out.println("Enter roll number and marks in 3 subjects for 10 students:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Roll No: ");
            roll[i] = sc.nextInt();
            System.out.print("Enter 3 marks: ");
            for (int j = 0; j < 3; j++) marks[i][j] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Roll	Total	Average");
        for (int i = 0; i < 10; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            System.out.println(roll[i] + "	" + total + "	" + avg);
        }
        sc.close();
    }
}