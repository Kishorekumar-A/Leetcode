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
    public int pairSum(ListNode head) {
        ListNode s=head,f=head,pr=null;
        while(f.next!=null&&f.next.next!=null)
        {
            
            s=s.next;
            f=f.next.next;
        }
        pr=s;
        ListNode p=null;
        s=s.next;
        while(s!=null)
        {
            
            ListNode n=s.next;
            s.next=p;
            p=s;
            s=n;
        }
    
        if(pr!=null)pr.next=null;
        // ListNode sl=head,fa=head;
        // while(f.next!=null&&f.next.next!=null)
        // {
            
        //     s=s.next;
        //     f=f.next.next;
        // }
        int ans=Integer.MIN_VALUE;
        while(head!=null)
        {
            
            int sum=head.val+p.val;
            ans=Math.max(sum,ans);
            p=p.next;
            // System.out.print(head.val+" ");
            head=head.next;
        }
        return ans;
    }
}