/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
       if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        // `even != null` rules out the list of only 1 node
        // `even.next != null` rules out the list of only 2 nodes
        while (even != null && even.next != null) {
            // Put odd to the odd list
            odd.next = odd.next.next;
            
            // Put even to the even list
            even.next = even.next.next;
            
            // Move the pointer to the next odd/even
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}   