class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        int island = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    dfs(i, j, visited, grid);
                    island++;
                }
            }
        }
        return island;
    }

    public void dfs(int row, int col, boolean[][] visited, char[][] grid) {
        if (row > -1 && row < grid.length && col < grid[0].length && col > -1 && grid[row][col] == '1' && !visited[row][col]) {
                    visited[row][col] = true;
                    dfs(row - 1, col, visited, grid);
                    dfs(row + 1, col, visited, grid);
                    dfs(row, col - 1, visited, grid);
                    dfs(row, col + 1, visited, grid);
                
            
        }
    }
}