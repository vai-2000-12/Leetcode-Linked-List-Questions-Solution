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
  public ListNode reverse(ListNode head){

      ListNode curr = head;
      ListNode prev = null;
      ListNode forw = null;

    while( curr != null){ 
        forw = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forw;
        } 
     return prev;
  }

    public ListNode removeNodes(ListNode head) {
    
    // My new head will be 8 after reversing the linked List...
     ListNode newHead = reverse(head);
     ListNode temp = newHead;

     while( temp.next != null){
       if(temp.next.val < temp.val){
         temp.next = temp.next.next;
       }else{
        temp = temp.next;
       }
     }    
     return reverse(newHead);
    }
}