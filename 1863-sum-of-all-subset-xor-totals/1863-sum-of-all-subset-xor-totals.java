class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(0, 0, nums);
    }

    private int helper(int i, int xor, int[] nums) {
        if (i > nums.length - 1) {            
            return xor;
        }
        
        int pick=helper(i+1,xor^=nums[i],nums);
        int notpick=helper(i+1,xor^=nums[i],nums);
        return pick+notpick;
    }
}