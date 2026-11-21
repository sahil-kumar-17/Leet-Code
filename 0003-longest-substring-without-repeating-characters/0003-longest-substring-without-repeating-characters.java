class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1)return s.length();
        HashSet<Character>mySet=new HashSet();
        int left=0,right=0;
        int len=0;
        while(right<s.length()){
            char curr=s.charAt(right);
            while(mySet.contains(curr)&&left<right){
                mySet.remove(s.charAt(left));
                left++;
            }
            mySet.add(curr);
            len=Math.max(len,mySet.size());
            right++;
        }
        return len;
    }
}