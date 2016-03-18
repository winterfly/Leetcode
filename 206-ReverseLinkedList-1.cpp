/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        stack<int> s;
        ListNode* node=head; 
        while (node) {
            s.push(node->val);
            node=node->next;
        }
        node=head;
        while (node) {
            node->val=s.top();
            s.pop();
            node=node->next;
        }
        return head;
    }
};
