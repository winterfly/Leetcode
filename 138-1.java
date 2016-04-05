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
        
        RandomListNode current = head;
        while (current != null) {
            RandomListNode node = new RandomListNode(current.label);
            map.put(current, node);
            dummy.next = node;
            dummy = dummy.next;
            current = current.next;
        }
        
        dummy = dummy0;
        current = head;
        RandomListNode temp;
        while (dummy.next != null) {
            dummy = dummy.next;
            temp = current.random;
            if (temp == null) {
                dummy.random = null;
            } else {
                dummy.random = map.get(temp);
            }            
            current = current.next;
        }
        
        return dummy0.next;
        
    }
}
