class Solution {
    public int singleNumber(int[] nums) {
        int u1 = 0;
        int u2 = 0;
        for (int i : nums) {
            u1 = (i ^ u1) & ~u2;
            u2 = (i ^ u2) & ~u1;
        }
        return u1;
    }
}