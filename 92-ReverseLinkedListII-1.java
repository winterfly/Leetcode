/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head==null||head.next==null||m==n) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode insert=dummy;
        for (int i=0;i<m-1;i++) {
            insert=insert.next;
        }
        int k=n-m;
        ListNode p=insert.next;
        for (int i=0;i<k;i++) {
            ListNode q=p.next;
            p.next=q.next;
            q.next=insert.next;
            insert.next=q;
        }
        return dummy.next;
    }
}
