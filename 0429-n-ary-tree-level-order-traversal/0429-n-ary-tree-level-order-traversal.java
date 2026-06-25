/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void level(Node root,List<List<Integer>> li,int l)
    {
        if(root==null) return;
        if(root.children==null) return;
       if(li.size()<=l) li.add(new ArrayList<Integer>());
        for(Node c:root.children)
        {
            li.get(l).add(c.val);
            level(c,li,l+1);
        }

    }
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> li=new ArrayList<>();
        if(root==null) 
        {
            return li;
        }
        li.add(new ArrayList<Integer>());
        li.get(0).add(root.val);
        level(root,li,1);
        li.removeIf(List::isEmpty);
        return li;
    }
}