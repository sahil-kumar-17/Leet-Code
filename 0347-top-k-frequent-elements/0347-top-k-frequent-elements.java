class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer,Integer>myMap=new HashMap();
     for(int i:nums){
        myMap.put(i,myMap.getOrDefault(i,0)+1);
     }
     PriorityQueue<Integer>minHeap=new PriorityQueue<>((a,b)->myMap.get(a)-myMap.get(b));
     for(int key:myMap.keySet()){
        minHeap.add(key);
        if(minHeap.size()>k){
            minHeap.poll();
        }
     }   
     int res[]=new int[k];
     for(int i=0;i<k;i++){
        res[i]=minHeap.poll();
     }
     return res;
    }
}