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
    public void reorderList(ListNode head) {
ListNode t=head,s=head,f=head,p=null;
while(f.next!=null&&f.next.next!=null)
{
   
    s=s.next;
    f=f.next.next;
}
ListNode se=s.next;
s.next=null;
s=se;
while(s!=null)
{
    ListNode n=s.next;
    s.next=p;
    p=s;
    s=n;
}
ListNode st=head,re=p;
while(re!=null)
{
    ListNode n=st.next,tem=re.next;
    st.next=re;
    re.next=n;

    st=n;
    re=tem;
    
}
    }}