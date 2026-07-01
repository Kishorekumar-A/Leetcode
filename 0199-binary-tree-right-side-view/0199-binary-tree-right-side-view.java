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
    public void level(List<List<Integer>>li,TreeNode root,int l)
    {
        if(root==null) return;
        if(li.size()<=l)
        {
            li.add(new ArrayList<>());
        }
        li.get(l).add(root.val);
        level(li,root.left,l+1);
        level(li,root.right,l+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>re=new ArrayList<>();
        if(root==null ) return re;
        List<List<Integer>>li =new ArrayList<>();
        level(li,root,0);
        for(int i=0;i<li.size();i++)
        {
            re.add(li.get(i).get(li.get(i).size()-1));
        }
        return re;
    }
}