class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            int temp=0;
            if(minprice>prices[i]){
                minprice=prices[i];
            }else{
                temp=Math.max(temp,prices[i]-minprice);
                minprice=prices[i];
            }
            max+=temp;
        }
        return max;
    }
}