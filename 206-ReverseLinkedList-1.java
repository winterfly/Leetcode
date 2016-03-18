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
        if (head==null||head.next==null) return head;
        Stack<Integer> stack=new Stack<>();
        ListNode node=head;
        while (node!=null) {
            stack.push(node.val);
            node=node.next;
        }
        node=head;
        while (node!=null) {
            node.val=stack.pop();
            node=node.next;
        }
        return head;
    }
}
