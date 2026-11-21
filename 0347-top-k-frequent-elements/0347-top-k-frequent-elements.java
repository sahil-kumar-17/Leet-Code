class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> myMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            myMap.put(key, myMap.getOrDefault(key, 0) + 1);
        }
        List<Integer>[] balti = new List[nums.length + 1];
        for (int key : myMap.keySet()) {
            int fre = myMap.get(key);
            if (balti[fre] == null) {
                balti[fre] = new ArrayList<>();
            }
            balti[fre].add(key);
        }
        int[] res = new int[k];
        int counter = 0;
        for (int i = (balti.length - 1); i >= 0 && counter < k; i--) {
            if(balti[i]!=null){
                for(Integer con:balti[i]){
                    res[counter++]=con;
                }
            }
        }
        return res;
    }
}