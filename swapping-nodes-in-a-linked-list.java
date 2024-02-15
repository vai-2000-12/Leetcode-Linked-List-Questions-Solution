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

import java.util.ArrayList;

class Solution {
    public ListNode swapNodes(ListNode head, int k) {

       if(head == null){
          return null;
       }   
       
    ListNode left = head;
    ListNode right = head;
 
 // This is the loop for getting the value from the Linked list;

 for( int i = 1 ; i < k ; i++)
   
   left = left.next;
   ListNode curr = left;

   while(curr.next != null){
      curr = curr.next;
      right = right.next;
   }
    
    int temp = left.val;
    left.val = right.val;
    right.val = temp;

   return head;
    }
}