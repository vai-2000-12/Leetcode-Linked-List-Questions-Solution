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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
        return null;
    }

    // Step 1: Reverse the First K Nodes:-
    ListNode curr = head;
    ListNode prev = null;
    ListNode forw = null;
    int count = k;

    while (curr != null && count > 0) {
        forw = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forw;
        count--;
    }

    // Step 2: Get the Recursive Call
    if(curr == null && count > 0){
        curr = prev;
        prev = null;
        forw = null;
        while(curr!= null){
             forw = curr.next;
             curr.next = prev;
             prev = curr;
             curr = forw;
        }
    }
    if(count > 0){
        return prev;
    }
    if (forw != null) {
        head.next = reverseKGroup(forw, k);
    }
    return prev;
    }
}