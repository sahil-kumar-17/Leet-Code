class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int index0=helper(0,n,dp,cost);
        int index1=helper(1,n,dp,cost);
        return Math.min(index0,index1);
    }
    int helper(int i,int n,int[]dp,int[]cost){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        return dp[i]=cost[i]+Math.min(helper(i+1,n,dp,cost),helper(i+2,n,dp,cost));
    }

}