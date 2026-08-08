class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!myMap.containsKey(nums[i])) {
                myMap.put(nums[i], 1);
            } else {
                myMap.put(nums[i],myMap.getOrDefault(nums[i], 1) + 1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:myMap.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>nums.length/2)return key;
        }
        return 0;
    }
}