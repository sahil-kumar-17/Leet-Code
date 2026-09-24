class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int digit=0;
            while(nums[i]>=10){
                digit+=nums[i]%10;
                nums[i]/=10;
            }
            digit+=nums[i];
            if(digit==i){
                return i;
            }
        }
        return -1;
    }
}