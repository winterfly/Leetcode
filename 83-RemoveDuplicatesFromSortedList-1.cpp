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
    ListNode* deleteDuplicates(ListNode* head) {
        ListNode* dummy=head;
        while (head) {
            ListNode* node=head;
            while (node->next&&node->val==node->next->val) {
                node=node->next;
            }
            if (head!=node) head->next=node->next;
            head=head->next;
        }
        return dummy;
    }
};
