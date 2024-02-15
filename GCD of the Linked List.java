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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
      // ListNode temp = head;
      ListNode C1 = head;
      ListNode C2 = head.next;


       while(C2 != null){
      int gcd = greatestCommonDivisor(C1.val, C2.val);
         ListNode newNode  =  new ListNode(gcd);     
          // insert
          C1.next = newNode;
          newNode.next = C2;
              
              C1 = C2;
              C2 = C2.next; 
       }

      return head;
    }
      private int greatestCommonDivisor(int a, int b){
        return b == 0 ? a : greatestCommonDivisor(b, a % b); 
  
    }
}