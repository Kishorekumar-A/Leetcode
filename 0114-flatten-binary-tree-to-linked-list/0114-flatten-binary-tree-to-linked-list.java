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
    public void pre(TreeNode root, List<Integer> li)
    {
        if(root==null) return;
        li.add(root.val);  
        pre(root.left,li);  
        pre(root.right,li);
    }
    public void flatten(TreeNode root) {
        TreeNode t=null;
        List<Integer> li=new ArrayList<>();
        pre(root,li);

        if(root!=null) root.left=null;
        System.out.println(li);
        for(int i=1;i<li.size();i++)
        {
            root.right=new TreeNode(li.get(i));
            root=root.right;
        }

    }
}