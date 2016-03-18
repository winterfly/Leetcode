/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode recursive(ListNode head) {
        if (head.next==null) return head;
        ListNode newhead=recursive(head.next);
        head.next.next=head;
        return newhead;
    }
    public ListNode reverseList(ListNode head) {
        if (head==null) return head;
        ListNode newhead=recursive(head);
        head.next=null;
        return newhead;
    }
}
