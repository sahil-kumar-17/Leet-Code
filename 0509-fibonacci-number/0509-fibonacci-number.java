class Solution {
    public int fib(int n) {
        if(n<2)return n;
        int a=1,b=0;
        int res=0;
        for(int i=2;i<=n;i++){
        //res=f(i)=a+b;
        //a=f(i-1)
        //b=f(i-2)
        res=a+b;
        b=a;
        a=res;
       
        }
        return res;
    }
}