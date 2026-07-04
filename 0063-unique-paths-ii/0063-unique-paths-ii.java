class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            obstacleGrid[i][0] = 10;
        }
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[0][i] == 1) {
                break;
            }
            obstacleGrid[0][i] = 10;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (i - 1 > -1 && j - 1 > -1 && obstacleGrid[i][j] != 1) {
                    if(obstacleGrid[i][j-1]==1){
                    obstacleGrid[i][j] = 0 + obstacleGrid[i - 1][j];
                    }
                    else if(obstacleGrid[i-1][j]==1){
                    obstacleGrid[i][j] = obstacleGrid[i][j-1]+0;
                    }
                    else{
                    obstacleGrid[i][j] = obstacleGrid[i][j-1]+obstacleGrid[i-1][j];

                    }

                }
            }
        }
        return obstacleGrid[n - 1][m - 1] / 10;
    }
}