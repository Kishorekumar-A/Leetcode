/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode merge(ListNode node1,ListNode node2)
    {
        if(node2==null) return node1;
        ListNode dummy=new ListNode(0);
        ListNode h=dummy;
        while(node1!=null&&node2!=null)
        {
            if(node1.val>node2.val)
            {
                dummy.next=new ListNode(node2.val);
                node2=node2.next;
            }
            else
            {
                  dummy.next=new ListNode(node1.val);
                node1=node1.next;
            }
            dummy=dummy.next;
        }
        if(node2==null) dummy.next=node1;
        else
        dummy.next=node2;
    return h.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<1) return null;
        ListNode node1=lists[0];
        for(int i=1;i<lists.length;i++)
        {
            node1=merge(node1,lists[i]);
        }
        return node1;
    }
}