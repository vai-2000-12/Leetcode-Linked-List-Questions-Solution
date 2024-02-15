
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

    public void reorderList(ListNode head) {

      // Finding the Middle Of the Linked List using the two pointer approch  
      ListNode slow = head;
      ListNode fast = head;

    while( fast != null &&  fast.next != null){

        slow = slow.next;
        fast = fast.next.next;
        
        }

     ListNode second = reverse(slow.next);
     slow.next = null;
     ListNode first = head;

     // Merging the Linked List :-

     while(second != null){
       ListNode temp1 = first.next;
       first.next = second;
       ListNode temp2 = second.next;
       second.next = temp1;
       first = temp1;
       second = temp2;
       }
    }
}