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
    public static ListNode reverse(ListNode left,ListNode right, ListNode start)
    {
        ListNode temp=start,pre=null;
        while(temp!=right)
        {
             ListNode ne=temp.next;
            temp.next=pre;
            pre=temp;
            temp=ne;
        }
        // start.next=right;
        // if(left!=null) left.next=pre;
        return pre;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
      int c=0;
      ListNode result=new ListNode(0);
      ListNode t=head,l=null,st=head,dummy=result;
      while(t!=null)
      {
         c++;
        t=t.next;
        if(c==k)
        {
            dummy.next=reverse(l,t,st);
            while(dummy.next!=null) dummy=dummy.next;

            // dummy.next=t;
            l=st;
            st=t;
            c=0;
        }
       
      }
        dummy.next=st;
      return result.next;
    }
}