class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    ans = dfs(grid, i, j);
                    break;
                }
            }
        }
        return ans;
    }

    int dfs (int[][] grid, int row, int col) {
        int n = grid.length;
        int m = grid[0].length;
        if (row < 0 || row == n) return 1;
        if (col < 0 || col == m) return 1;
        
        if (grid[row][col] == 0) return 1;
        if (grid[row][col] == 2) return 0;

        grid[row][col] = 2;

        
        return dfs(grid, row + 1, col) + dfs(grid, row - 1, col)
        + dfs(grid, row, col + 1) + dfs(grid, row, col - 1);

        


    }
}