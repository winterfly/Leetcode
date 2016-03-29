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
    int n = 0;
    int result = -1;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
        return result;
    }
    void dfs(TreeNode root, int k){
        if (root == null || n >= k)
            return;
        dfs(root.left, k);
        n++;
        if (n == k)
            result = root.val;
        dfs(root.right, k);
    }
}
