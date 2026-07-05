class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<m;i++){
            dp[0][i]=matrix[0][i];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int left=(i-1)>-1&&(j-1)>-1?dp[i-1][j-1]:(int)1e9;
                int up=(i-1)>-1?dp[i-1][j]:(int)1e9;
                int right=(i-1)>-1&&(j+1)<m?dp[i-1][j+1]:(int)1e9;
                    dp[i][j]=Math.min(left,Math.min(up,right))+matrix[i][j];
            }
        }
        int min=(int)1e9;
        for(int i=0;i<m;i++){
            min=Math.min(min,dp[n-1][i]);
        }
        return min;
    }
}