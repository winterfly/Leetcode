/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy,fast=dummy;
        for (int i=0;i<n+1;i++) {
            if (fast==null) return head;
            fast=fast.next;
        }
        // move the slow pointer to the node prior to the one to be deleted, which is when the fast pointer becomes null
        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        // delete the node 
        slow.next=slow.next.next;
        // DO NOT return head!
        return dummy.next;
        
    }
}
