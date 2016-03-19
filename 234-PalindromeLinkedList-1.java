/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null) return true;
        int n=0;
        ListNode node=head;
        while (node!=null) {
            n++;
            node=node.next;
        }
        int n1=n/2;
        ListNode dummy=new ListNode(0);
        for (int i=0;i<n1;i++) {
            ListNode temp=head.next;
            head.next=dummy.next;
            dummy.next=head;
            head=temp;
        }
        if (n%2==1) head=head.next;
        dummy=dummy.next;
        while(head!=null) {
            if (head.val!=dummy.val) return false;
            head=head.next;
            dummy=dummy.next;
        }
        return true;
    }
}
