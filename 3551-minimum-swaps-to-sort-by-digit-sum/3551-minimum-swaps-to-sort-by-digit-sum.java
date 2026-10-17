
import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int minSwaps(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        Integer[] aux = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            aux[i] = nums[i];
        }

        Arrays.sort(aux, (a, b) -> {
            int sumA = digitSum(a);
            int sumB = digitSum(b);

            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }

            return Integer.compare(a, b);
        });

        for (int i = 0; i < nums.length; i++) {
            myMap.put(aux[i], i);
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            while (myMap.get(nums[i]) != i) {
                int j = myMap.get(nums[i]);

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                count++;
            }
        }

        return count;
    }

    private int digitSum(int a) {
        int sum = 0;

        while (a > 0) {
            sum += a % 10;
            a /= 10;
        }

        return sum;
    }
}
