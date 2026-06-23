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
       TreeNode ans=new TreeNode();
       TreeNode pr=ans;
    public void in(TreeNode root)
    {
        if(root==null) return ;
        in(root.left);
        root.left=null;
        pr.right=root;
        pr=root;
        in(root.right);
        
    }
    public TreeNode increasingBST(TreeNode root) {
        in(root);
        return ans.right;
    }
}