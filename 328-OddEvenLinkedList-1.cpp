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
    ListNode* oddEvenList(ListNode* head) {
        if (head==NULL||head->next==NULL) return head;
        
        ListNode* p1=head, *p2=head->next;
        while (p2!=NULL && p2->next!=NULL) {
            ListNode* temp = p2->next;
            p2->next=temp->next;
            temp->next=p1->next;
            p1->next=temp;
            p1=temp;
            p2=p2->next;
        }
        
        return head;
        
    }
};
