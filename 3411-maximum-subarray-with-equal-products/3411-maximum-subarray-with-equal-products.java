class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int start = 0; start < n; start++) {
            int gcd = nums[start];
            int lcm = nums[start];
            int prod = nums[start];
            for (int end = start + 1; end < nums.length; end++) {
                prod *= nums[end];
                gcd = GCD(gcd, nums[end]);
                lcm = LCM(lcm, nums[end]);
                if (prod == gcd * lcm) {
                    max = Math.max(max, end - start + 1);
                }
            }
        }
        return max;
    }

    private int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private int LCM(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return (int) Math.abs(a / GCD(a, b) * b);
    }
}