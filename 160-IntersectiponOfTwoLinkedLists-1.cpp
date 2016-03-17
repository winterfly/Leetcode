/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {

private:
    int getLength(ListNode *head) {
        int len=0;
        while (head) {
            len++;
            head=head->next;
        }
        return len;
    }

public:

    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (!headA||!headB) return NULL;
        int l1=getLength(headA);
        int l2=getLength(headB);
        if (l1>l2) {
            int diff=l1-l2;
            for (int i=0;i<diff;i++) headA=headA->next;
        } else {
            int diff=l2-l1;
            for (int i=0;i<diff;i++) headB=headB->next;
        }
        
        int len=min(l1,l2);
        for (int i=0;i<len;i++) {
            if (headA==headB) return headA;
            headA=headA->next;
            headB=headB->next;
        }
        return NULL;
    }
};
