/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        if (node==null) return;
        ListNode pre=node,post=node.next;
        while (post!=null) {
            pre.val=post.val;
            if (post.next==null) {
                pre.next=null;  
                break;
            }
            pre=post;
            post=post.next;
        }
        
        
    }
}
