class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length - 1;
        int start = 0;
        int max = 0;
        while (start <= n) {
            List<Integer> myList = new ArrayList<>();
            int end = start;
            while (end <= n) {
                myList.add(nums[end]);
                int gcd = myList.get(0);
                int lcm = myList.get(0);
                int product = myList.get(0);
                for (Integer i = 1; i < myList.size(); i++) {
                    gcd = GCD(gcd, myList.get(i));
                    lcm = LCM(lcm, myList.get(i));
                    product *= myList.get(i);
                }
                if (product == (gcd * lcm)) {
                    max = Math.max(myList.size(), max);
                }
                end++;
            }
            start++;
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