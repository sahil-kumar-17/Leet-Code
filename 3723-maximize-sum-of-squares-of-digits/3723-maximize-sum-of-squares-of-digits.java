class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int tempsum = sum;
        int digit = 9;
        StringBuilder ans=new StringBuilder();
        while (tempsum > 0 && digit > 0 &&ans.length()<=num) {
            if (digit > tempsum) {
                digit--;
            } else if (digit <= tempsum) {
                tempsum = tempsum - digit;
                ans.append(digit);
            }
        }
        while(ans.length()<num){
            ans.append(0);
        }
        if (ans.length() > num) {
            return "";
        }
        return ans.toString();
    }
}