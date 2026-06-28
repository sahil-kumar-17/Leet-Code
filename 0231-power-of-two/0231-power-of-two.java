class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1)return false;
        if(n==1){
            return true;
        }
        int res=1;
        for(int i=1;i<=32;i++){
            res*=2;
            if(res==n){
                return true;
            }
        }
        return false;
    }
}