class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int []dp=new int[n];
        return helper(0,s,dp);
    }

    int helper(int i, String s,int[]dp) {
        if (i == s.length())
            return 1;
        if(s.charAt(i)=='0')return 0;
        if(dp[i]!=0){
            return dp[i];
        }   
        int ways = 0;
        int twoDigit = i+2<=s.length()?Integer.parseInt(s.substring(i, i + 2)):0;
        ways+=helper(i+1,s,dp);
        if(twoDigit>=10&&twoDigit<=26){
            ways+=helper(i+2,s,dp);
        }
        dp[i]=ways;
        return dp[i];
    }
}