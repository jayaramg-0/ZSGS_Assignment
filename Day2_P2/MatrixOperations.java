import java.util.Scanner;

public class MatrixOperations {

    // Method to input elements
    static void inputMatrix(int[][] A, int m, int n, Scanner sc) {
        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display matrix
    static void displayMatrix(int[][] A, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to sum all elements
    static int sumAll(int[][] A, int m, int n) {
        int sum = 0;
        for (int[] row : A) {
            for (int val : row) {
                sum += val;
            }
        }
        return sum;
    }

    // Method to display row-wise sum
    static void rowWiseSum(int[][] A, int m, int n) {
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += A[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }
    }

    // Method to display column-wise sum
    static void colWiseSum(int[][] A, int m, int n) {
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += A[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
    }

    // Method to transpose matrix
    static void transposeMatrix(int[][] A, int m, int n) {
        System.out.println("Transpose:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter columns (n): ");
        int n = sc.nextInt();

        int[][] A = new int[m][n];
        int choice;

        do {
            System.out.println("\nMENU:");
            System.out.println("1. Input Matrix");
            System.out.println("2. Display Matrix");
            System.out.println("3. Sum of all elements");
            System.out.println("4. Row-wise sum");
            System.out.println("5. Column-wise sum");
            System.out.println("6. Transpose Matrix");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inputMatrix(A, m, n, sc);
                    break;
                case 2:
                    displayMatrix(A, m, n);
                    break;
                case 3:
                    System.out.println("Total Sum = " + sumAll(A, m, n));
                    break;
                case 4:
                    rowWiseSum(A, m, n);
                    break;
                case 5:
                    colWiseSum(A, m, n);
                    break;
                case 6:
                    transposeMatrix(A, m, n);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
