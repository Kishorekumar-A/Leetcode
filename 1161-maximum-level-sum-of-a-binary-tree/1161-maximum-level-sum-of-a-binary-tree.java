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
    public void level(List<Integer> li,TreeNode root,int l)
    {
        if(root==null) return;
         if(li.size()<=l)
        {
            li.add(root.val);
        }
        else{
            li.set(l,li.get(l)+root.val);
        }
        level(li,root.left,l+1);
        level(li, root.right,l+1);
    }
    public int maxLevelSum(TreeNode root) {
        int m=Integer.MIN_VALUE,in =-1;
        List<Integer> li=new ArrayList<>();
        level(li,root,0);
        // System.out.println(li);
        for(int i=0;i<li.size();i++)
        {
           
            // m=Math.max(s,m);
            if(m<li.get(i))
            {
                m=li.get(i);
                in=i;
            }
        }
        return in+1;
    }
}