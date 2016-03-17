/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode head1=head,head2=head.next;
        while (head1!=null&&head2.next!=null) {
            ListNode head3=head2.next;
            head2.next=head3.next;
            head3.next=head1.next;
            head1.next=head3;
            head1=head3;
            head2=head2.next;
            if (head2==null) break;
        }
        return head;
    }
}
