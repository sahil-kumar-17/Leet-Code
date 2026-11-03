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
    public int minDepth(TreeNode root) {
        return dfs(root,0);
    }
    private int dfs(TreeNode root,int count){
        if(root==null)return count;
        if(root.left!=null&&root.right==null){
            return dfs(root.left,count+1);
        }else if(root.right!=null&&root.left==null){
            return dfs(root.right,count+1);
        }else {
            return Math.min(dfs(root.left,count+1),dfs(root.right,count+1));
        }
    }
}