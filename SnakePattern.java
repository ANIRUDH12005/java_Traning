public class SnakePattern {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15, 16}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Snake Pattern:");
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Left to Right
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Right to Left
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
