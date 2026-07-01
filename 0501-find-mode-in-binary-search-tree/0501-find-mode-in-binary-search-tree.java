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

    public void inor(TreeNode root, Map<Integer,Integer> map)
    {
        if(root==null) return;
        inor(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        inor(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        inor(root,map);
        int m=Collections.max(map.values());
        List<Integer> li=new ArrayList<>();
        for(Map.Entry<Integer,Integer> en:map.entrySet())
        {
            if(en.getValue()>=m)
            {
                li.add(en.getKey());
            }
        }

        int ar[]=new int[li.size()];
        for(int i=0;i<li.size();i++)
        {
            ar[i]=li.get(i);
        }
        // System.out.println(li);
        return ar;
    }
}