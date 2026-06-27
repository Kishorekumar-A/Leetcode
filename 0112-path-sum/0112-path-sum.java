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
    int p=0;
    public boolean path(TreeNode root , int t)
    {
        
        if(root==null) 
        {
            return false;
        }
       p+=root.val;
        // System.out.print(p);      
    
    if(root.left==null&&root.right==null)
    {
        boolean a=(p==t);
        p-=root.val;
        return a;

    }

       boolean le= path(root.left,t);
        boolean ri=path(root.right,t);
        
    p-=root.val;
        return le||ri;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
    return path(root,targetSum);
    }
}