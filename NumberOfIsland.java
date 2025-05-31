public class NumberOfIsland {

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;

        // Traverse every cell
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);  // Mark all connected land
                }
            }
        }

        return count;
    }

    // DFS to mark connected lands
    public static void dfs(char[][] grid, int i, int j) {
        // Check for out-of-bounds or water
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        // Mark current cell as visited
        grid[i][j] = '0';

        // Visit all 4 directions
        dfs(grid, i - 1, j); // up
        dfs(grid, i + 1, j); // down
        dfs(grid, i, j - 1); // left
        dfs(grid, i, j + 1); // right
    }

    // Main method to test the code
    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        int result = numIslands(grid);
        System.out.println("Number of islands: " + result);
    }
}
