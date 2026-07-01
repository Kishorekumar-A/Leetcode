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
    public void level(List<List<Integer>> li,TreeNode root,int l)
    {
        if(root==null) return;
        if(li.size()<=l) li.add(new ArrayList<>());
        li.get(l).add(root.val);
        level(li,root.left,l+1);
        level(li,root.right,l+1);
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        level(list,root,0);
        Collections.reverse(list);
        return list;
    }
}