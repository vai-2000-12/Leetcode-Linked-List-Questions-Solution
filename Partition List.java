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
    public ListNode partition(ListNode head, int x) {
  
        ListNode small = new ListNode(0);
        ListNode s = small;
        ListNode large = new ListNode(0);
        ListNode l = large;
        
        ListNode curr = head;

        while(curr != null){
          if(curr.val < x){
               s.next = curr;
               s = s.next;
          }else{
             l.next = curr;
             l = l.next;
          }
            curr = curr.next;
        }
           l.next = null;
           s.next = large.next;

        return small.next;
    }
}