public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define two matrices
        int[][] A = {
            {1, 2},
            {3, 4}
        };

        int[][] B = {
            {5, 6},
            {7, 8}
        };

        // Rows of A, columns of B
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        // Create result matrix C
        int[][] C = new int[rowsA][colsB];

        // Matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                C[i][j] = 0; // initialize
                for (int k = 0; k < colsA; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        System.out.println("Result matrix C:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
