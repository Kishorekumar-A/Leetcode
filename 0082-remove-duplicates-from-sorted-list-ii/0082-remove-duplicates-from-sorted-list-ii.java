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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode re=new ListNode(0);
        re.next=head;
        ListNode t=head,p=re;
        while(t!=null)
        {
            if(t.next!=null&&t.val==t.next.val)
            {
                int d=t.val;
                while(t!=null&&t.val==d) 
                {
                    t=t.next;
                }
                p.next=t;
            }
            else
            {
                p=t;
                t=t.next;
            }
        }
        return re.next;
    }
}