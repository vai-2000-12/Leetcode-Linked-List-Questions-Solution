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

       while(curr != null){
          forw = curr.next;
          curr.next = prev;
          prev = curr;
          curr = forw;
       }
      return prev;
    } 

    public ListNode doubleIt(ListNode head) {

    ListNode Nhead = reverse(head);
    ListNode temp = Nhead;
       int carry = 0;
  
    for( temp = Nhead ; temp != null ; temp = temp.next){

       int n =  (2 * temp.val) + carry ;
        temp.val = n % 10;
        carry =   n /10;
       
       if( temp.next == null && carry != 0) { temp.next = new ListNode(carry); temp = temp.next;}  
     }
      return reverse(Nhead);
    }
}