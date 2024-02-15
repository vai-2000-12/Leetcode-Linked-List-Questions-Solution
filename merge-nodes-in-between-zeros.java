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
    public ListNode mergeNodes(ListNode head) {
      
    ListNode temp = new ListNode(-1);
    ListNode curr;
    curr = temp;
    int sum = 0;

    while( head != null){
       if(head.val != 0){
         sum = sum + head.val;
       }else{
          curr.next = new ListNode(sum);
          curr= curr.next;
          sum = 0;
       }
       head = head.next;
     }
       return temp.next.next;
    }
    }