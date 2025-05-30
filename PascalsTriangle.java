import java.util.Scanner;

public class PascalsTriangle {

    // Function to calculate factorial
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }

    // Function to calculate nCr (combinations)
    public static int nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void printPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            // Print spaces for alignment
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print values in the row
            for (int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + " ");
            }

            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        printPascalsTriangle(rows);
    }
}
