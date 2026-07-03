class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return rob(0,nums,dp);   
     }
     private int rob(int i, int []nums,int[]dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int pick=nums[i]+rob(i+2,nums,dp);
        int notPick=rob(i+1,nums,dp);
        return dp[i]=Math.max(pick,notPick);
     }
}