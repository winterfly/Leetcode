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
    public boolean getNode(TreeNode root,int path,int depth) {
        while ((depth--)>0 && root!=null) {
            if ((path & (1 << depth))!=0) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return root!=null;
    }
    public int countNodes(TreeNode root) {
        int depth = 0;
        TreeNode node = root;
        while (node!=null) {
            depth++;
            node = node.left;
        }
        if (depth == 0) {
            return 0;
        }
        int left = 0, right = (1 << (depth - 1)) - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            if (getNode(root, mid, depth - 1)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (1 << (depth - 1)) + right;
    }
}
