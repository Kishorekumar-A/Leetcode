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

            // if(root.left!=null&&root.right!=null)
        // {
        //     if(root.left.val<m&&root.right.val>m) return true;
        //     else return false;
        // }
        // if(root.right!=null)
        // {
        //     if(root.right.val>m) return true;
        //     else return false;
        // }
        // if(root.left!=null)
        // {
        //     if(root.left.val<m) return true;
        //     else return false;
        // }
        // return valid(root.left,m)&&valid(root.right,m);
    // public boolean min(TreeNode root, int m)
    // {
    //      if(root==null) return true;
    //     System.out.println(root.val+" "+m);
    //     if(root.val>=m) return false;
    //     return min(root.left,root.val)&&min(root.right,root.val);
    // }
    // public boolean max(TreeNode root,int m)
    // {
    //     if(root==null) return true;
    //     if(root.val<=m) return false;
    //     return max(root.left,root.val)&&max(root.right,root.val);
    // }
    public boolean check(TreeNode root,long min,long max)
    {
        if(root==null) return true;
        if(root.val<=min||root.val>=max) return false;
        return check(root.left,min,root.val)&& check(root.right,root.val,max);
    }

    public boolean isValidBST(TreeNode root) {
       if(root==null) return true;
       return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}