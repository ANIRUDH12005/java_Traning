import java.util.Stack;

public class MaxRectangle {
    
    public static int maximalRectangle(int[][] matrix) {
        if (matrix.length == 0) return 0;

        int maxArea = 0;
        int cols = matrix[0].length;
        int[] heights = new int[cols];

        for (int[] row : matrix) {
            for (int i = 0; i < cols; i++) {
                if (row[i] == 0)
                    heights[i] = 0;
                else
                    heights[i] += 1;
            }
            int area = largestRectangleArea(heights);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < heights.length) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                int area = heights[top] * width;
                maxArea = Math.max(maxArea, area);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            int area = heights[top] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 0, 0, 1, 0}
        };

        System.out.println("Maximum rectangle area is: " + maximalRectangle(matrix));
    }
}
