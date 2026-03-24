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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>que=new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode node:lists)
        {
            if(node!=null)
            que.add(node);
        }

        ListNode dummy= new ListNode(0);
        ListNode temp=dummy;
        while(!que.isEmpty())
        {
            ListNode cur=que.poll();
            temp.next=cur;
            temp=temp.next;

            if(cur.next!=null)
            {
                que.add(cur.next);
            }
        }
        return dummy.next;
    }
}