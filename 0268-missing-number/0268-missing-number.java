class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer>myMap=new HashMap<>();
        for(int num:nums){
            myMap.put(num,1);
        }
        for(int i=0;i<=nums.length;i++){
            if(!myMap.containsKey(i))return i;
        }
        return -1;
    }
}