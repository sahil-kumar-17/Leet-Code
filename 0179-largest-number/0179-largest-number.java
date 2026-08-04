class Solution {
    public String largestNumber(int[] nums) {
        String arr[] = new String[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (b, a) -> (a + b).compareTo(b + a));
        String s="";
        if(arr[0].equals("0"))return "0";
        for(String ans:arr){
            s+=ans;
        }
        return s;
    }
}