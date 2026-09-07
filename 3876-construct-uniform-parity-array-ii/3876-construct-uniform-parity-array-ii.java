class Solution {
    public boolean uniformArray(int[] nums) {
        int odd = 0;
        int even = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                even++;
            } else {
               odd++;
            }
        }
        if(odd==nums.length||even==nums.length)return true;
        Arrays.sort(nums);
        if(nums[0]%2==0)return false;
        return true;
    }
}