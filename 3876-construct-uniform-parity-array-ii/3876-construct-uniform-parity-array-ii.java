class Solution {
    public boolean uniformArray(int[] nums) {
        int min=(int)1e9;
        int even=0;
        for(int i:nums){
            min=Math.min(i,min);
            if(i%2==0)even++;
        }
        if(even==nums.length)return true;
        if(min%2==0)return false;
        return true;
    }
}