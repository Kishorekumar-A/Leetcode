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
    public void in(List<Integer> li,TreeNode root)
    {
        if(root==null) return;
        in(li,root.left);
        li.add(root.val);
        in(li,root.right);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>li=new ArrayList<>();
        in(li,root1);
        in(li,root2);
        Collections.sort(li);
        return li;
    }
}