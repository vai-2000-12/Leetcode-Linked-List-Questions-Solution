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
    public int[] nextLargerNodes(ListNode head) {
        
        // Boundary Check:-
        if(head == null || head.next == null) return new int[1];

        ListNode curr = head;
        ListNode temp = head;
        
        int count =0;

      // method to find the Length of the Linked List:-
        while(curr != null ){
             count++;
             curr = curr.next;
        }
        
     curr = head; 
     int[] arr= new int[count]; 
     int k = 0;

     // nextLargerNode concept:-  
     for(curr = head ; curr != null ; curr = curr.next){

         if(curr.next != null){

            for(temp = curr.next ; temp != null ; temp= temp.next){
               
                if(temp.val > curr.val){
                  arr[k++] = temp.val;
                  break;

                }
            } 
            if(temp == null) k++;
         }   
     }  
            return arr;
    }
}