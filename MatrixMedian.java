import java.util.*;

public class MatrixMedian {

    public static int findMedian(int[][] matrix, int r, int c) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < r; i++) {
            if (matrix[i][0] < min) min = matrix[i][0];
            if (matrix[i][c - 1] > max) max = matrix[i][c - 1];
        }

        int desired = (r * c + 1) / 2;

        while (min < max) {
            int mid = min + (max - min) / 2;
            int place = 0;

            for (int i = 0; i < r; i++) {
                place += countSmallerEqual(matrix[i], mid);
            }

            if (place < desired)
                min = mid + 1;
            else
                max = mid;
        }

        return min;
    }

    public static int countSmallerEqual(int[] row, int target) {
        int l = 0, h = row.length;
        while (l < h) {
            int mid = (l + h) / 2;
            if (row[mid] <= target)
                l = mid + 1;
            else
                h = mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        int r = 3, c = 3;

        System.out.println(findMedian(matrix, r, c));
    }
}
