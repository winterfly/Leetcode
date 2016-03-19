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
    ListNode* insertionSortList(ListNode* head) {
        if (!head||!head->next) return head;
        ListNode* dummy=new ListNode(INT_MIN); // must allocate, otherwise runtime error
        dummy->next=head;
        ListNode* pre=head;
        while (pre->next) {
            ListNode* insert=dummy;
            ListNode* current=pre->next; // save time to use current other than directly using pre->next
            while (insert!=pre&&insert->next->val<=current->val) insert=insert->next;
            if (insert!=pre) {
                ListNode* next=current->next;
                current->next=insert->next;
                insert->next=current;
                pre->next=next;
            } else {
                pre=pre->next;
            }
        }
        return dummy->next;
    }
};
