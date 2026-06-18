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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        level(list, root, 0);
        return list;
    }
    public static void level(List<List<Integer>> list, TreeNode root, int level){
        if(root == null){
            return;
        }
        if(list.size() <= level){
            list.add(new ArrayList<Integer>());
        }
        list.get(level).add(root.val);
        level(list, root.left, level+1);
        level(list, root.right, level+1);
    }
}