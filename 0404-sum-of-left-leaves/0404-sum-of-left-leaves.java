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
   
    // public void left(TreeNode root)
    // {
    //     if(root==null) return;
    //     left(root)
    // }
    public int tra(TreeNode root)
    {
         int s=0;
        if(root==null) return 0 ;
        if(root.left!=null&&root.left.left==null&&root.left.right==null)
         s+=root.left.val;

        s+=tra(root.left);
       s+= tra(root.right);
        return s;
    }
    public int sumOfLeftLeaves(TreeNode root){
       return tra(root);
       
    }
}