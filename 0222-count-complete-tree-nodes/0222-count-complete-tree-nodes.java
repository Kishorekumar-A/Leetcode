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
    public int c=0;
    public void tr(TreeNode root)
    {
        if(root==null) return;

        c++;
        tr(root.left);
        tr(root.right);
    }
    public int countNodes(TreeNode root) {
        tr(root);
        return c;
    }
}