class Solution {
    public String addBinary(String a, String b) {
        int l1 = a.length();
        int l2 = b.length();
        if (l1 > l2) {
            for (int i = l2; i < l1; i++) {
                b = "0" + b;
            }
        } else {
            for (int i = l1; i < l2; i++) {
                a = "0" + a;
            }
        }
        int i = a.length()-1;
        int carry = 0;
        int res=0;
        String result = "";
        while (i>=0) {
            int temp = carry+(a.charAt(i)-'0')+(b.charAt(i)-'0');
            res=temp%2;
            carry=temp/2;
            result=res+result;
            i--;
        }
        if(carry!=0)return carry+result;
        return result;
    }
}