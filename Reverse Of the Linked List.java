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
    public ListNode reverseList(ListNode head) {
        
        // Boundary Condtion For the Linked Lis..!
        if(head == null || head.next == null){
           return head;
        }      

        ListNode current = head;
        ListNode previous = null;
        ListNode forw = null;

        while(current != null){
          forw = current.next;
          current.next  = previous;
          previous = current;
          current = forw;
        }
        return previous;
    }
}