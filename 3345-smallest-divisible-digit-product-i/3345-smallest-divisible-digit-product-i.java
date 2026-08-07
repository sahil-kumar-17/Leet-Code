class Solution {
    public int smallestNumber(int n, int t) {
        if(makeShift(n)%t==0)return n;
        while(makeShift(n)%t!=0){
            n++;
        }
        return n;
    }
    private int makeShift(int n){
        int product=1;
        while(n>0){
        int digit=n%10;
         product*=digit;
         n/=10;
        }
        return product;
    }
}