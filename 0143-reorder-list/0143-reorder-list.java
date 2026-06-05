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
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode next=null;
        ListNode temp=head;
        while(temp!=null)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null&&fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode rev=reverse(slow.next);
       slow.next=null;
       ListNode l1=head;
       ListNode l2=rev;
       while(l2!=null)
       {
        ListNode t1=l1.next;
        ListNode t2=l2.next;
        l1.next=l2;
        l2.next=t1;
        l1=t1;
        l2=t2;
       }

    }
}