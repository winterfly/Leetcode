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
    public int countNodes(TreeNode root) {
        if (root==null) return 0;
        int dl=1,dr=1;
        TreeNode l=root.left;
        TreeNode r=root.right;
        while (l!=null) {
            dl++;
            l=l.left;
        }
        while (r!=null) {
            dr++;
            r=r.right;
        }
        if (dl==dr) return (1<<dl)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
