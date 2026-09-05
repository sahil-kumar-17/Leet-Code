class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int t1[]=new int[nums.length];
        t1[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            t1[i]=Math.max(t1[i-1],nums[i]);
        }
        int t2[]=new int[nums.length];
        t2[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            t2[i]=Math.min(t2[i+1],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(t1[i]-t2[i]<=k){
                return i;
            }
        }
        return -1;
    }
}