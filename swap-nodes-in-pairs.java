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
    public ListNode swapPairs(ListNode head) {

      if(head  == null || head.next == null){
        return head;
      }    
     
       int count = 0;
      ListNode curr = head;
      ListNode prev = null;
      ListNode forw = null;

      while( curr != null && count < 2 ){
        forw = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forw;
        count++;
      }
      if(forw != null){
        head.next= swapPairs(forw);
      }
      return prev;
      }
  }