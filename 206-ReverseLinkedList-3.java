/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null) return head;
        ListNode left=head,middle=head.next,right;
        while (middle!=null) {
            right=middle.next;
            middle.next=left;
            left=middle;
            middle=right;
        }
        head.next=null;
        return left;
    }
}
