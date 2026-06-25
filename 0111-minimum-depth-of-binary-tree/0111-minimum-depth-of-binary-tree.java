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
    int l=0,min=Integer.MAX_VALUE;

    public void depth(TreeNode root, int l)
    {
        if(root==null)
        {
            return ;
        }
        if(root.left==null&&root.right==null)
        {
            min=Math.min(min,l);
        }
        depth(root.left,l+1);
        depth(root.right,l+1);

        // return Math.min(min,l);        
    }
    public int minDepth(TreeNode root) {
depth(root,0);
if(root==null) return 0;
     return min+1;

    }
}