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
    // List<List<Integer>> li=new ArrayList<>();
    int m=Integer.MIN_VALUE;
    public void level(List<Integer> li,TreeNode root,int l)
    {
        if(root==null) return;
        if(li.size()<=l)
        {
            li.add(root.val);
        }
        else if(li.get(l)<root.val)
        {
            li.set(l,root.val);
        }
        level(li,root.left,l+1);
        level(li,root.right,l+1);
    }
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> li=new ArrayList<>();
        level(li,root,0);
        return li;
    }
}