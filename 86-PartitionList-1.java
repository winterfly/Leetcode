/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head==null||head.next==null) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode first=dummy;
        while(first.next!=null&&first.next.val<x) first=first.next;
        if (first.next==null) return head;
        ListNode second=first.next;
        while (second.next!=null) {
            if (second.next.val<x) {
                ListNode temp=second.next;
                second.next=temp.next;
                temp.next=first.next;
                first.next=temp;
                first=temp;
            } else {
                second=second.next;
            }
        }
        return dummy.next;
    }
}
