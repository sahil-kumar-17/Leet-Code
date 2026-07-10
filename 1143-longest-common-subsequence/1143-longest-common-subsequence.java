class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        int[][]dp=new int[n][m];
        for(int i=0;i<n;i++)Arrays.fill(dp[i],-1);
        return helper(n-1,m-1,text1,text2,dp);
    }
    int helper(int i,int j,String t1,String t2,int[][]dp){
        if(i<0||j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j))return dp[i][j]=1+helper(i-1,j-1,t1,t2,dp);
        return dp[i][j]=Math.max(helper(i-1,j,t1,t2,dp),helper(i,j-1,t1,t2,dp));
    }
}