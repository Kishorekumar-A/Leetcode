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
    List<String> li=new ArrayList<>();
    public void pre(TreeNode root,StringBuilder sb)
    {
        if(root==null){
            return;
        }
        int l=sb.length();
        sb.append(String.valueOf(root.val));
        if(root.left==null&&root.right==null)
        { 
            
            li.add(sb.toString());
            // sb.deleteCharAt(sb.length()-1);
            // return;
        }
        else{
            sb.append("->");
        pre(root.left,sb);
        pre(root.right,sb);
        }
        sb.setLength(l);
        // if(sb.length()>1) sb.deleteCharAt((sb.toString().trim()).length()-1);

        

    }
    public List<String> binaryTreePaths(TreeNode root) {
    List<String> re=new ArrayList<>();
        
        pre(root,new StringBuilder());
        // for(String s: li)
        // {
        //     // String st="";
        //     // for(int i=0;i<s.length();i++)
        //     // {
        //     //     st+=s.charAt(i);
        //     //     if(i<s.length()-1) st+="->";
        //     // }
        //     // re.add(st);
        //     String stt=s.substring(0,s.length());
        //     String st=stt.replaceAll("\\s+"," ");
        //     re.add(st);
        // }
        
        return li;

    }
}