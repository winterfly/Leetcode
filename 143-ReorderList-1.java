/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if (head==null||head.next==null||head.next.next==null) return;
        ListNode slow=head, fast=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=slow.next;
        while (fast.next!=null) {
            ListNode temp=fast.next;
            fast.next=temp.next;
            temp.next=slow.next;
            slow.next=temp;
        }
        ListNode first=head;
        while (slow.next!=null) {
            ListNode second=slow.next;
            slow.next=second.next;
            second.next=first.next;
            first.next=second;
            first=second.next;
        }
    }
}
