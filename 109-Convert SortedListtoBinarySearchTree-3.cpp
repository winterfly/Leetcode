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
    TreeNode* sortedArrayToBST(vector<int> &array, int start, int end) {
        if (start>end) return NULL;
        int mid=start+(end-start)/2;
        TreeNode* head=new TreeNode(array[mid]);
        head->left=sortedArrayToBST(array,start,mid-1);
        head->right=sortedArrayToBST(array,mid+1,end);
        return head;
    }
    TreeNode* sortedListToBST(ListNode* head) {
        vector<int> array;
        int n=0;
        while (head) {
            array.push_back(head->val);
            n++;
            head=head->next;
        }
        return sortedArrayToBST(array,0,n-1);
    }
};
