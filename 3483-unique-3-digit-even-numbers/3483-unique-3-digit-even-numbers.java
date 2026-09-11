class Solution {
    public int totalNumbers(int[] digits) {
        HashSet<Integer> myset = new HashSet<>();
        boolean[] used = new boolean[digits.length];
        for (int i = 0; i < digits.length; i++) {
            if(digits[i]==0)continue;
            used[i] = true;
            helper( 1, digits[i], used, digits, myset);
            used[i] = false;
        }
        return myset.size();
    }

    private int helper(int d, int num, boolean[] used, int[] digits, HashSet<Integer> myset) {
        if (d == 3) {
            if ( num % 2 == 0) {
                myset.add(num);
            }
            return myset.size();
        }
        for (int i = 0; i < digits.length; i++) {
            if (!used[i]) {
            int newnum=0;
                newnum = (num * 10) + digits[i];
                used[i] = true;
                helper( d + 1, newnum, used, digits, myset);
                used[i] = false;
            }
        }

        return myset.size();
    }
}