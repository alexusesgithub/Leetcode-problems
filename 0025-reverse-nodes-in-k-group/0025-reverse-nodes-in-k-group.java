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
    public ListNode reverse(ListNode head,ListNode tail)
    {
        ListNode next=null;
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=tail)
        {
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)
        {
            return head;
        }
        ListNode tail=head;
        for(int i=0;i<k;i++)
        {
            if(tail==null)
            return head;
            tail=tail.next;
        }
        ListNode ans=reverse(head,tail);
        head.next=reverseKGroup(tail,k);
        return ans;
    }
}