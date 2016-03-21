/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode dummy0=dummy;
        while (dummy.next!=null&&dummy.next.next!=null) {
            if (dummy.next.val==dummy.next.next.val) {
                int num=dummy.next.val;
                ListNode temp=dummy.next.next.next;
                while (temp!=null&&temp.val==num) {
                    temp=temp.next;
                }
                dummy.next=temp;
            } else {
                dummy=dummy.next;
            }
        }
        return dummy0.next;
    }
}
