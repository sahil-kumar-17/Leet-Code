class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        HashSet<Integer>mySet=new HashSet<>();
        for(int n:nums){
            mySet.add(n);
        }
        int var1=0;
        for(int num:mySet){
            if(!mySet.contains(num-1)){
                int curr=num;
                int temp=1;
                while(mySet.contains(curr+1)){
                    curr++;
                    temp++;
                }
                var1=Math.max(var1,temp);
            }
        }
        return var1;
    }
}