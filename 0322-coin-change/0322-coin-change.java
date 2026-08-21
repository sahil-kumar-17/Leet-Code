class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length][amount + 1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans = helper(coins.length - 1, amount, coins, dp);
        return ans == (int) 1e9 ? -1 : ans;
    }

    private int helper(int i, int t, int[] c, int[][] dp) {
        if (t == 0)
            return 0;
        if (i == 0) {
            if (t % c[i] == 0)
                return t / c[i];
            return (int) 1e9;
        }
        if (dp[i][t] != -1)
            return dp[i][t];
        int notPick = helper(i - 1, t, c,dp);
        int pick = (int) 1e9;
        if (c[i] <= t) {
            pick = helper(i, t - c[i], c,dp);
            pick = pick == (int) 1e9 ? (int) 1e9 : 1 + pick;
        }

        return dp[i][t]= Math.min(pick, notPick);
    }
}