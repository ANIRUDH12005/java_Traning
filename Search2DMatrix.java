public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        // Check for empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Loop through each row
        for (int i = 0; i < matrix.length; i++) {
            // Check if the target could be in this row
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                // Loop through the row
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }

        // Not found
        return false;
    }

    // Test the code
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        boolean result = searchMatrix(matrix, target);
        System.out.println("Is target present? " + result);
    }
}
