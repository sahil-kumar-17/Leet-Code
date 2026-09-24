class Solution {
    public int reverse(int x) {
        int num=x;
        int digit=0;
        int rev=0;
        if(num<0){
            if(((long)num*(-1))>Integer.MAX_VALUE){
                return 0;
            }
            num*=-1;
        }
        while(num>0){
            digit=num%10;
            if(((long)rev*10+digit)>Integer.MAX_VALUE){
                return 0;
            }
            rev=rev*10+digit;
            num/=10;
        }
        if(x<0){
            rev*=(-1);
        }
        return rev;
    }
}