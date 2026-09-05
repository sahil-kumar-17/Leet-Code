class Solution {
    public int subsetXORSum(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        return helper(0, 0, 0, temp, nums);
    }

    private int helper(int i, int xor, int sum, List<Integer> temp, int[] nums) {
        if (i > nums.length - 1) {
            for (int j : temp) {
                xor ^= j;
            }
            sum += xor;
            return sum;
        }
        temp.add(nums[i]);
        int pick=helper(i+1,xor,sum,temp,nums);
        temp.remove(temp.size()-1);
        int notpick=helper(i+1,xor,sum,temp,nums);
        sum=pick+notpick;
        return sum;
    }
}