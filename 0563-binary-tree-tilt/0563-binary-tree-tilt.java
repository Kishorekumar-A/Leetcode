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
    // public int sum(TreeNode root, int s,int d)
    // {
    //     if(root==null) return 0;
    //     s+=root.val;
    //     // (root.left.val+root.right.val);
    //     int ls=sum(root.left,s,d);
    //     int rs=sum(root.right,s,d);
        
    //     return s;

    // }
    // public int diff(TreeNode root,int s)
    // {
    //     if(root==null) return 0;
    //     // s+= Math.abs(diff(root.left,s)-diff(root.right,s));
    //     if(root.left!=null&&root.right!=null)
    //     {

    //     }
    //     return s;
    // }
   int su=0;

    public int post(TreeNode root)
    {
        if(root==null) return 0;
        
        int l=post(root.left);
        int r=post(root.right);
        su+=Math.abs(l-r);
        return l+r+root.val;
    }
    public int findTilt(TreeNode root) {
        
        int sum=post(root);
    
//     //   int d=  diff(root,0);
// return left_sum;
        return su;
    }
}