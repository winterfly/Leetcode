/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null) return true;
        ListNode slow=head,fast=head;
        while (fast.next!=null&&fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode pre=slow.next;
        while (pre.next!=null) {
            ListNode insert=pre.next;
            pre.next=insert.next;
            insert.next=slow.next;
            slow.next=insert;
        }
        while (slow.next!=null){
            slow=slow.next;
            if (head.val!=slow.val) return false;
            head=head.next;
        }
        return true;
    }
}
