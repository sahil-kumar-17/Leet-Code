class Solution {
    public int change(int amount, int[] coins) {
        int dp[]=new int[amount+1];
        dp[0]=1;
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<dp.length;j++){
                int curr=dp[j];
                int ways=j>=coins[i]?dp[j-coins[i]]:0;
                dp[j]=curr+ways;
            }
        }
        return dp[amount];
    }
}