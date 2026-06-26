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
    public boolean sym(TreeNode le,TreeNode ri)
    {
        if(le==null&&ri==null) return true;
        if(le==null||ri==null) return false;
        
        if(le.val!=ri.val) return false;

        return sym(le.left,ri.right)&&sym(le.right,ri.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        

        return sym(root.left,root.right);
    }
}