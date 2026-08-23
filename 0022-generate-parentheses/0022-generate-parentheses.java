class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        return helper("", 0, 0, ans, n);
    }

    private List<String> helper(String s, int open, int close, List<String> ans, int n) {
        if (s.length() == n * 2) {
            ans.add(s);
            return ans;
        }
        if (open < n) {
            helper(s + "(", open + 1, close, ans, n);
        }
        if (close < open) {
            helper(s + ")", open, close + 1, ans, n);
        }
        return ans;
    }
}