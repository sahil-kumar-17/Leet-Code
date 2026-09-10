/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int averageOfSubtree(TreeNode root) {
        int arr[]=new int[3];
        arr=helper(root,arr);
        return arr[2];
    }
    private int[]helper(TreeNode root,int[]arr){
        if(root==null){
            return arr;
        }
        int []left=helper(root.left,arr);
        int []right=helper(root.right,arr);
        int sum=left[0]+right[0]+root.val;
        int count=left[1]+1+right[1];
        int avgcount=left[2]+right[2];
        if(count>0&&root.val==sum/count){
            avgcount++;
        }
        return new int[]{sum,count,avgcount};
    }
}