/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head==null||head.next==null) return head;
        int len=0;
        ListNode node=head;
        while (node!=null) {
            len++;
            node=node.next;
        }
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode dummy0;
        dummy0=dummy;
        for (int interval=1;interval<len;interval*=2) {
            ListNode slow=dummy0.next,fast=dummy0.next;
            dummy=dummy0;
            while (fast!=null) {
                for (int i=0;i<interval;i++) {
                    fast=fast.next;
                    if (fast==null) break;
                }
                int l1=0,l2=0;
                while (true) {
                    if ((l1==interval||slow==null)&&(l2==interval||fast==null)) break;
                    if (slow!=null&&l1<interval&&(l2==interval||fast==null||slow.val<fast.val)) {
                        dummy.next=slow;
                        slow=slow.next;
                        l1++;
                    } else {
                        dummy.next=fast;
                        fast=fast.next;
                        l2++;
                    }
                    dummy=dummy.next;
                    dummy.next=null;
                }
                slow=fast;
            }
        }
        
        return dummy0.next;
    }
}
