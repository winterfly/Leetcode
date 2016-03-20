/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode last=dummy;
        int len=0;
        while (last.next!=null) {
            last=last.next;
            len++;
        }
        k=k%len;
        if (k==0) return head;
        
        ListNode slow=head,fast=head;
        for (int i=0;i<=k;i++) {
            fast=fast.next;
        }
        while(fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        
        last.next=head;
        dummy.next=slow.next;
        slow.next=null;
        return dummy.next;
    }
}
