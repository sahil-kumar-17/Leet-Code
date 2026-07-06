class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[][]dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        dp[0][0]=triangle.get(0).get(0);
        int ans=(int)1e9;
        for(int j=0;j<n;j++){
        ans=Math.min(ans,helper(dp,n-1,j,triangle));
        }
        return ans;
    }
    private int helper(int[][]dp,int i,int j,List<List<Integer>>triangle){
       if(i==0&&j==0)return triangle.get(0).get(0);
       if(dp[i][j]!=-1)return dp[i][j];
        int p1=j>0?helper(dp,i-1,j-1,triangle):(int)1e9;
        int p2=j<i?helper(dp,i-1,j,triangle):(int)1e9;
        return dp[i][j]=triangle.get(i).get(j)+Math.min(p1,p2);
    }
}