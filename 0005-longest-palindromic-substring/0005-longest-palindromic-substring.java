class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)return s;
        String res = "";
        for (int i = 1; i < s.length(); i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            String pal = s.substring(left+1, right);
            if (pal.length() > res.length()) {
                res = pal;
            }
            left = i - 1;
            right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            pal = s.substring(left+1, right);
            if (pal.length() > res.length()) {
                res = pal;
            }
        }
        return res;
    }
}