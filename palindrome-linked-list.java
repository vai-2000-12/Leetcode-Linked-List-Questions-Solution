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
   // Function for Finding the reverse  of the Linked List
    
   public ListNode reverse(ListNode head){
      if(head == null || head.next == null){
        return head;
      }

      ListNode current = head;
      ListNode previous = null;
      ListNode forw = null;

      while(current!= null){
        forw = current.next;
        current.next = previous;
        previous = current;
        current = forw;
      }
      return previous;
   }

   // Function for Finding the Middle Element in the Linked List ..

    public ListNode midNode(ListNode head){
       if(head == null || head.next != null){
          return head;
       }

       ListNode slowPtr = head;
       ListNode fastPtr = head;

       while(fastPtr != null && fastPtr.next != null){
         slowPtr = slowPtr.next;
         fastPtr = fastPtr.next.next;

       }
       return slowPtr;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null ){
          return true;
        }

        ListNode mid = midNode(head);
        ListNode nhead = mid.next;
        mid.next = null;

        nhead = reverse(nhead);

        ListNode c1 = head;
        ListNode c2 = nhead;

        boolean flag = true;

    while(c1 != null && c2 != null){
          if( c1.val != c2.val ){
            flag = false;
            break;
          }
          c1 = c1.next;
          c2 = c2.next; 
        }

        nhead = reverse(nhead);
        mid.next = nhead;
        
       return flag;
    }
}