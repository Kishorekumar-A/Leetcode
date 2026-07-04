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
    public void in(TreeNode root,List<Integer> li)
    {
        if(root==null) return;
        in(root.left,li);
        li.add(root.val);
        in(root.right,li);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> li=new ArrayList<>();
        in(root,li);
        return li.get(k-1);
    }
}