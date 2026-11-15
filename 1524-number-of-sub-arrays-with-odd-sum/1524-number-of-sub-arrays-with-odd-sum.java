class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD=((int)1e9+7);
        long count=0,odd=0,even=1;
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(prefix%2!=0){
                count+=even;
                count%=MOD;
                odd++;
            }else{
                count+=odd;
                count%=MOD;
                even++;
            }
        }
        return (int)count;
    }
}