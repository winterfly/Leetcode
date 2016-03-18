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
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* dummy=new ListNode(0);
        dummy->next=head;
        ListNode* dummy0=dummy;
        while (dummy->next) {
            if (dummy->next->val==val) {
                dummy->next=dummy->next->next;
            } else {
                dummy=dummy->next;
            }
        }
        return dummy0->next;
        
    }
};
