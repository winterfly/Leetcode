/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode dummy0 = dummy;
        
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        
        RandomListNode old = head;
        while (old != null) {
            RandomListNode node = new RandomListNode(old.label);
            map.put(old, node);
            dummy.next = node;
            dummy = dummy.next;
            old = old.next;
        }
        
        dummy = dummy0;
        old = head;
        RandomListNode temp;
        while (dummy.next != null) {
            dummy = dummy.next;
            temp = old.random;
            if (temp == null) {
                dummy.random = null;
            } else {
                dummy.random = map.get(temp);
            }            
            old = old.next;
        }
        
        return dummy0.next;
        
    }
}
