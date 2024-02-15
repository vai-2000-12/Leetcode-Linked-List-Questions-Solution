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
  
  public ListNode getTail(ListNode node ){
    while(node.next != null){
      node = node.next;
    }
    return node;
  }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
      
      if(list1 == null || list2 == null)
      {
         return list1 != null ? list1 : list2;
      }

      ListNode curr = list1, an = null , bn = null;
      int indx = 0;

      while(curr!= null){
        if(indx == a-1) an = curr;
        else if( indx == b+1) bn = curr;
        curr = curr.next;
        indx++;
      }

      an.next = list2;
      getTail(list2).next = bn;            
      return list1;
  }
}