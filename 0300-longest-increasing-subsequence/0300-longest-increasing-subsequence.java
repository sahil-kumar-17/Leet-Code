class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        Integer dp[][]=new Integer[n][n+1];
        int curr=0;
        int prev=-1;
        return helper(curr,prev,nums,dp);
    }
   private static int helper(int curr,int prev,int []nums,Integer[][]dp){
        if(curr==nums.length)return 0;
        if(dp[curr][prev+1]!=null)return dp[curr][prev+1];
        int taken=0;
        if(prev==-1||nums[curr]>nums[prev]){
            taken=1+helper(curr+1,curr,nums,dp);
        }

        int skipped=helper(curr+1,prev,nums,dp);
        dp[curr][prev+1]=Math.max(taken,skipped);
        return dp[curr][prev+1];
    }
}