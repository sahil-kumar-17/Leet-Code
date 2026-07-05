class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int[n][n];
        dp[0][0]=triangle.get(0).get(0);
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                int p1=i-1>-1&&j<=i-1?dp[i-1][j]:(int)1e9;
                int p2=i-1>-1&&j-1>-1?dp[i-1][j-1]:(int)1e9;
                dp[i][j]=triangle.get(i).get(j)+Math.min(p1,p2);
            }
        }
        int minsum=(int)1e9;
        for(int i=0;i<n;i++){
            minsum=Math.min(minsum,dp[n-1][i]);
        }
        return minsum;
    }
}