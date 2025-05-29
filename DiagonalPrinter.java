public class DiagonalPrinter {
    public static void main(String[] args) {
        // Example 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length; // Assuming it's a square matrix

        // Print primary diagonal (top-left to bottom-right)
        System.out.print("Primary Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        // Print secondary diagonal (top-right to bottom-left)
        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][n - 1 - i] + " ");
        }

        System.out.println();
    }
}
