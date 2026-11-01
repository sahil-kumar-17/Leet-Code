class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]-min;
        }
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return sum;
    }
}