/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* toBST(ListNode* head, int n) {
        if (!head||n<=0) return NULL;
        int nleft=n/2;
        TreeNode* left=toBST(head,nleft);
        for (int i=0;i<nleft;i++) {
            head=head->next;
        }
        TreeNode* treeHead=new TreeNode(head->val);
        treeHead->left=left;
        treeHead->right=toBST(head->next,n-nleft-1);
        return treeHead;
    }
    TreeNode* sortedListToBST(ListNode* head) {
        int n=0;
        ListNode* node=head;
        while (node) {
            n++;
            node=node->next;
        }
        return toBST(head,n);
        
    }
};
