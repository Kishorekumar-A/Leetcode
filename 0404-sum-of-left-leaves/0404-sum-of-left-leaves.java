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
    int s=0;
    // public void left(TreeNode root)
    // {
    //     if(root==null) return;
    //     left(root)
    // }
    public void tra(TreeNode root)
    {
        if(root==null) return ;
        if(root.left!=null&&root.left.left==null&&root.left.right==null)
         s+=root.left.val;

        tra(root.left);
        tra(root.right);
        // return s;
    }
    public int sumOfLeftLeaves(TreeNode root){
        tra(root);
        // s-=root.val;
        return s;
    }
}