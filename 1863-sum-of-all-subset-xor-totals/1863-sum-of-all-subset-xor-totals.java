class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(0, 0, 0, nums);
    }

    private int helper(int i, int xor, int sum, int[] nums) {
        if (i > nums.length - 1) {            
            sum += xor;
            return sum;
        }
        xor^=nums[i];
        int pick=helper(i+1,xor,sum,nums);
        xor^=nums[i];
        int notpick=helper(i+1,xor,sum,nums);
        sum=pick+notpick;
        return sum;
    }
}