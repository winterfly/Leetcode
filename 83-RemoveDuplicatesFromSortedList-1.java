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
        ListNode dummy=head;
        while (head!=null) {
            ListNode node=head;
            int val=node.val;
            while (node.next!=null&&node.next.val==val) {
                node=node.next;
            }
            if (node!=head) {
                head.next=node.next;
            }
            head=head.next;
        }
        return dummy;
    }
}
