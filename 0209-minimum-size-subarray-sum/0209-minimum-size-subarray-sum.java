class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int left = 0;
        int count = (int) 1e9;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                count = Math.min(count, (i - left) + 1);
                sum-=nums[left];
                left++;
            }
        }
        if (count == (int) 1e9) {
            return 0;
        }
        return count;
    }
}