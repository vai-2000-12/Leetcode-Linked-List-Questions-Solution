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
    public ListNode[] splitListToParts(ListNode head, int k) {
       
      //Find the Count of the Nodes in the Linked List:-
       int count = 0;
       ListNode temp = head;
       while(temp != null){
           temp = temp.next;
           count++;
       } 

      // Find the Length of each array after breakdown :-
       int len = count / k;  // Size of each Array Of ListNodes
       int rem = count % k;  // extra Nodes
       ListNode curr = head;
       ListNode prev = head;

       ListNode[] arr = new ListNode[k];

       int i =0;
       while(curr != null && i < k){
         arr[i] = curr;
         int extra = 0;

         if(rem > 0){
             extra = 1;     
         }else {
            extra = 0;
         }
         for( int j = 0 ; j < len + extra ; j++ ){
              prev = curr;
              curr = curr.next;
         } 
        prev.next = null;
        i++;
        rem --;
       }    

       return arr; 
    }

}