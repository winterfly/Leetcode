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
    bool isPalindrome(ListNode* head) {
        if (!head||!head->next) return true;
        // cacluate the length of the node list.
        int n=0;
        ListNode* node=head;
        while (node) {
            n++;
            node=node->next;
        }
        // reverse the first half of the list
        ListNode* dummy=new ListNode(0);
        int n1=n/2;
        for (int i=0;i<n1;i++) {
            ListNode* next=head->next;
            head->next=dummy->next;
            dummy->next=head;
            head=next;
        }
        if (n%2==1) head=head->next;//if n is odd, pass the median one
        // check if it is palindrome.
        dummy=dummy->next;
        while (head) {
            if (head->val!=dummy->val) return false;
            head=head->next;
            dummy=dummy->next;
        }
        return true;
    }
};
