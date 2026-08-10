class Solution {
    public int hIndex(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int pages = nums.length - i;
            if (nums[i] >= pages) {
                return pages;
            }
        }
        return 0;
    }
}