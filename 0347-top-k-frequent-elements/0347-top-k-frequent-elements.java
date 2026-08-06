class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!myMap.containsKey(nums[i])) {
                myMap.put(nums[i], 1);
            } else {
                myMap.put(nums[i], myMap.getOrDefault(nums[i], 0) + 1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for(Map.Entry<Integer,Integer>entry:myMap.entrySet()){
            pq.offer(entry);
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll().getKey();
        }
        return ans;
    }
}