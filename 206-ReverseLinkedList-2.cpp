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

    ListNode* recursive(ListNode* head) {
        if (!head->next) return head;
        ListNode* newhead=recursive(head->next);
        head->next->next=head;
        return newhead;
    }

    ListNode* reverseList(ListNode* head) {
        if (!head||!head->next) return head;
        ListNode* newhead=recursive(head);
        head->next=NULL;
        return newhead;
    }
};
