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
    public void pre(Node root, List<Integer> li)
    {
        if(root==null) return;
        li.add(root.val);
        for(Node ch:root.children)
        {
            pre(ch,li);
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> li=new ArrayList<>();
        pre(root,li);
        return li;
    }
}