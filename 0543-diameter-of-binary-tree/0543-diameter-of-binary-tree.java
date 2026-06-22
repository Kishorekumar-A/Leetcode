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
   int d=0;
    public int depth(TreeNode root)
    {
        if(root==null) return 0;
         int l=depth(root.left);
         int r=depth(root.right);
         d=Math.max(l+r,d);
        return 1+Math.max(l,r);
    }
    // public static void pre(TreeNode root, int m)
    // {
    //     if(root==null) return ;
    //     m=Math.max(depth(root),m);
    //     System.out.println(m);
    //     pre(root.left,m);
    //     pre(root.right,m);
    // }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root== null) return 0;
        
 
        depth(root);
        return d;
    }
}