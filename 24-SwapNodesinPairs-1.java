/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode dummy0=dummy;
        while (dummy.next!=null&&dummy.next.next!=null) {
            ListNode pre=dummy.next;
            ListNode post=pre.next;
            pre.next=post.next;
            post.next=pre;
            dummy.next=post;
            dummy=pre;
        }
        return dummy0.next;
        
    }
}
