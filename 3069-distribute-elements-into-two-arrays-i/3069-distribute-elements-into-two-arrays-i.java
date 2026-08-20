class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int ind1=0;
        int ind2=0;
        for(int i=2;i<nums.length;i++){
            if(arr1[ind1]>arr2[ind2]){
                arr1[++ind1]=nums[i];
            }else{
                arr2[++ind2]=nums[i];
            }
        }
        int ans[]=new int[nums.length];
        int index=0;
        for(int i:arr1){
            if(i!=0){
            ans[index++]=i;
            }
        }
        for(int j:arr2){
            if(j!=0){
                ans[index++]=j;
            }
        }
        return ans;
    }
}