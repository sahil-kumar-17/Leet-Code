class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        int res=0;
        StringBuilder result = new StringBuilder("");
        while (i>=0||j>=0) {
            int temp = carry+(i>=0?a.charAt(i)-'0':0)+(j>=0?b.charAt(j)-'0':0);
            res=temp%2;
            carry=temp/2;
            result.append(res);
            i--;
            j--;
        }
        if(carry!=0)return result.append(carry).reverse().toString();
        return result.reverse().toString();
    }
}