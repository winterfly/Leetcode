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
    static ListNode currentHead=null;
    public TreeNode toBST(int start, int end) {
        if (start>end) return null;
        int mid=start+(end-start)/2;
        TreeNode left=toBST(start,mid-1);
        TreeNode head=new TreeNode(currentHead.val);
        currentHead=currentHead.next;
        head.left=left;
        head.right=toBST(mid+1,end);
        return head;
    }
    public TreeNode sortedListToBST(ListNode head) {
        int n=0;
        ListNode node=head;
        while (node!=null) {
            n++;
            node=node.next;
        }
        currentHead=head;
        return toBST(0,n-1);
    }
}
