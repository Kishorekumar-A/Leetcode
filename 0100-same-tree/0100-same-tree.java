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
    ArrayList<String> pl=new ArrayList<>();
    ArrayList<String> ql=new ArrayList<>();
    public void preOrder(TreeNode root, ArrayList<String> li) {
        if (root == null) {
            li.add("N");
            return;
        }

        li.add(String.valueOf(root.val));
        preOrder(root.left, li);
        preOrder(root.right, li);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        preOrder(p, pl);
        preOrder(q, ql);

        return pl.equals(ql);
    }
}