class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incre=1;
        int temp1=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                temp1++;
            }else{
                temp1=1;
            }
            if(temp1>incre){
                incre=temp1;
            }
        }
        int decre=1;
        int temp2=1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                temp2++;
            }else{
                temp2=1;
            }
            if(temp2>decre){
                decre=temp2;
            }
        }
        return incre>decre?incre:decre;
    }
}