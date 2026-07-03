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
    public TreeNode insert(TreeNode root,int v)
    {
        if(root==null)
        {
            return new TreeNode(v);
        }
        if(root.val>v)
        {
            root.left=insert(root.left,v);
        }
        if(root.val<v)
        {
            root.right=insert(root.right,v);
        }
        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++)
        {
        root=insert(root,preorder[i]);
        }
        // Queue<TreeNode> q=new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty())
        // {

        // }
        return root;
    }
}