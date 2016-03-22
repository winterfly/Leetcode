/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode dummy0=dummy;
        int remainder=0;
        while (l1!=null||l2!=null) {
            int val1=l1!=null?l1.val:0;
            int val2=l2!=null?l2.val:0;
            int val=val1+val2+remainder;
            remainder=val/10;
            ListNode node=new ListNode(val%10);
            dummy.next=node;
            dummy=node;
            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        if (remainder!=0) {
            ListNode node=new ListNode(remainder);
            dummy.next=node;
        }
        return dummy0.next;
    }
}
