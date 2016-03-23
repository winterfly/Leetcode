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
    TreeNode* toBST(ListNode* &head, int start, int end) {
        if (start>end) return NULL;
        int mid=start+(end-start)/2;
        TreeNode* left=toBST(head,start,mid-1);
        TreeNode* treeHead=new TreeNode(head->val);
        head=head->next;
        TreeNode* right=toBST(head,mid+1,end);
        treeHead->left=left;
        treeHead->right=right;
        return treeHead;
    }
    TreeNode* sortedListToBST(ListNode* head) {
        int n=0;
        ListNode* node=head;
        while (node) {
            n++;
            node=node->next;
        }
        return toBST(head,0,n-1);
    }
};
