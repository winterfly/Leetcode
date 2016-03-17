/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public int getLen(ListNode head) {
        int len=0;
        while (head!=null) {
            len++;
            head=head.next;
        }
        return len;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int l1=getLen(headA);
        int l2=getLen(headB);
        
        if (l1==0||l2==0) return null;
        if (l1>l2) {
            int diff=l1-l2;
            while(diff>0) {
                headA=headA.next;
                diff--;
            }
        } else if (l2>l1) {
            int diff=l2-l1;
            while(diff>0) {
                headB=headB.next;
                diff--;
            }
        }
        
        while (headA!=null) {
            if (headA==headB) return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
}
