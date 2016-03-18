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
        if (!head||!head->next) return head;
        ListNode* left=head, *middle=head->next;
        while (middle) {
            ListNode* right=middle->next;
            middle->next=left;
            left=middle;
            middle=right;
        }
        head->next=NULL;
        return left;
    }
};
