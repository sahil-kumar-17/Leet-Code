class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        long sum=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            sum+=nums[right]-nums[left];
            left++;
            right--;
        }
        if(nums.length%2!=0){
            return sum+nums[right];
        }
        return sum;
    }
}