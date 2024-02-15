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
    public int pairSum(ListNode head) {
        
        ListNode slow = head; ListNode fast = head;
         ListNode first = head; int maxSum = 0;

        // Finding the Mid of the Linked List:-

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2 : Reverse the second half of LL:

        ListNode newNode = slow;
        ListNode prev = null;

        while(slow != null){
          newNode = slow.next;
          slow.next = prev;

          prev = slow;
          slow = newNode;
        }
     
      // Step 3: Finding the Max Sum 

      while(prev != null){
        maxSum = Math.max(maxSum, prev.val + first.val);
        prev = prev.next;
        first = first.next;

      }
         return maxSum;
    }
}