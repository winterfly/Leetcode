/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public TreeNode toBST(ListNode head, int n) {
        if (head==null||n<=0) return null;
        ListNode mid=head;
        int nleft=n%2==0?n/2-1:n/2;
        for (int i=0;i<nleft;i++) {
            mid=mid.next;
        }
        TreeNode headnew=new TreeNode(mid.val);
        headnew.left=toBST(head,nleft);
        headnew.right=toBST(mid.next,n-nleft-1);
        return headnew;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null) return null;
        int n=0;
        ListNode node=head;
        while (node!=null) {
            n++;
            node=node.next;
        }
        return toBST(head,n);
    }
}
