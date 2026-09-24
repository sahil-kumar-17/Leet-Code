class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10&&nums[i]==i){
                return i;
            }
            int number=nums[i];
            int digit=0;
            int totalSum=0;
            while(number>=10){
                digit=number%10;
                totalSum+=digit;
                number/=10;
            }
            totalSum+=number;
            if(totalSum==i){
                return i;
            }
        }
        return -1;
    }
}