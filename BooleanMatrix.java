public class BooleanMatrix {
    
    public static void modifyMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        boolean[] rowFlag = new boolean[rows];
        boolean[] colFlag = new boolean[cols];

        // Step 1: Mark rows and columns that need to be set to 1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        // Step 2: Update the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowFlag[i] || colFlag[j]) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {0, 0, 0},
            {0, 0, 1}
        };

        modifyMatrix(matrix);
        printMatrix(matrix);
    }
}
