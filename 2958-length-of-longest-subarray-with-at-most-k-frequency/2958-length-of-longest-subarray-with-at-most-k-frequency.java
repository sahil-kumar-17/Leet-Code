class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int size = 0;
        int left = 0;
        int right = 0;
        int temp = 0;
        while (left <= right && right < nums.length) {
            myMap.put(nums[right], myMap.getOrDefault(nums[right], 0) + 1);
            while (myMap.get(nums[right]) > k) {
                myMap.put(nums[left], myMap.getOrDefault(nums[left], 0) - 1);
                left++;
            }
            size=Math.max(size,right-left+1);
            right++;
        }
        return size;
    }
}