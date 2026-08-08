class Solution {
    public int majorityElement(int[] nums) {
                int maxnum=0;
        int count=0;
        for(int i:nums){
            if (count==0){
                maxnum=i;
            }
            if(i==maxnum){
                count++;
            }else{
                count--;
            }
        }
        return maxnum;
    }
}