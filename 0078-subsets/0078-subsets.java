class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        return helper(0, ans, temp, nums);
    }

    private List<List<Integer>> helper(int i, List<List<Integer>> ans, List<Integer> temp, int[] nums) {
        if (i > nums.length - 1) {
            List<Integer>t1=new ArrayList<>(temp);
            ans.add(t1);
            return ans;
        }
        temp.add(nums[i]);
        helper(i + 1, ans, temp, nums);
        temp.remove(temp.size()-1);
        helper(i + 1, ans, temp, nums);
        return ans;
    }
}