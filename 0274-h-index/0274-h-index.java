class Solution {
    public int hIndex(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int temp=0;
            int page=nums[i];
            for(int j=i;j<n;j++){
                if(page>0&&nums[j]>=nums[i]){
                    temp++;
                    page--;
                }
                count=Math.max(count,temp);
            }
        }
        return count;
    }
}