class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>mySet=new HashSet<>();
        for(int n:nums){
            mySet.add(n);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!mySet.contains(k*i)){
                return k*i;
            }
        }
        return k;
    }
}