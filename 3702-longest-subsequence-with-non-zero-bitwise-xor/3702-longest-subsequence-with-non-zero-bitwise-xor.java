class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=0;
        int nonzero=0;
        for(int n:nums){
            xor^=n;
            if(n!=0){
                nonzero++;
            }
        }
        if(xor!=0){
        return nums.length;
        }
        if(nonzero>0){
            return nums.length-1;
        }
        return 0;
    }
}