class Solution {
    public long countCommas(long n) {
        if (n < 1000)
            return 0;
        long count = 0;
        long th = 1000;
        while (n >= th) {   
            count+=n-(th-1);
            th *= 1000;
        }
        return count;
    }
}