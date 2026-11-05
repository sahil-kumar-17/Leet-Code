class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if((int)Math.abs(arr1[i]-arr2[j])<=d){
                    arr1[i]=0;
                }
            }
        }
        int count=0;
        for(int i:arr1){
            if(i==0)count++;
        }
        return arr1.length-count;
    }
}