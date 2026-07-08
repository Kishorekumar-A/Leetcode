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
    public int min=Integer.MAX_VALUE;
    TreeNode pr=null;
    public void in(TreeNode root)
    {
        if(root==null) return;
        // int d=Integer.MAX_VALUE,d1=Integer.MAX_VALUE;
       
        in(root.left);
        if(pr!=null)
        {
            min=Math.min(min,root.val-pr.val);
        }
        pr=root;
        in(root.right);
    }
    public int getMinimumDifference(TreeNode root) {
        in(root);
        return min;
    }
}