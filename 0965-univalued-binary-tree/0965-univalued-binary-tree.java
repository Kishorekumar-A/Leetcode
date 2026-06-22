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

     
    // public static void inorder(TreeNode root,List<Integer> li)
    // {
        
    //     if(root==null) return;
    //     inorder(root.left,li);
    //     li.add(root.val);
    //     inorder(root.right,li);

    // }
    // public boolean isUnivalTree(TreeNode root) {
    //     List<Integer> li=new ArrayList<>();
    //     inorder(root,li);
    //     int t=li.get(0);
    //     System.out.println(li);
    //     for(int i: li)
    //     {
    //         if(t!=i) return false;
    //     }
    //     return true;
    // }
    public static boolean uni(TreeNode root, int v)
    {
        if(root==null) return true;
        if(root. val!=v) return false;

        return uni(root.left,v)&&uni(root.right,v);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        return uni(root,root.val);        
    }
}