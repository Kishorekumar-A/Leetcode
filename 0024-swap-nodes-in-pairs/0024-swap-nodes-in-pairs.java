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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode h=new ListNode(0);
        ListNode t=head,p=null,re=h;
        while(t!=null&&t.next!=null)
        {
            p=t;
            ListNode n=t.next;
            t=n.next;
            p.next=null;
            n.next=null;
            re.next=n;
            re=re.next;

            re.next=p;
            re=re.next;

        }
if (t != null) {
            re.next = t;
        } else {
            re.next = null;
        }        return h.next;
    }
}