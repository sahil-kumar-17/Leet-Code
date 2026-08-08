class Solution {
    public int majorityElement(int[] nums) {
        int maxnum=nums[0];
        int count=0;
        for(int n:nums){
            if(n==maxnum){
                count++;
            }else{
                count--;
            }
            if(count==0){
                maxnum=n;
                count++;
            }
        }
        return maxnum;
    }
}