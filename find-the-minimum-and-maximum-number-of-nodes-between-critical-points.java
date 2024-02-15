  /*
       Algorithm:
       Step 1 : Find the Critical Points(CP) in whole Linked List..

            1.1 Local max:  CP > next  && C.P > prev where (next -> points to its next of CP node and " prev " points to node prev to CP)

            1.1 Local min:  CP < next  && C.P <  prev where (next -> points to its next node and " prev " points to node prev to it)

       Step 2 : Get those Indexes Where the Critical Points are found
      
       Step3 : Find MAX And MIN distance between the C.P..

       */   

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
      List<Integer> ls = new ArrayList<Integer>();
      
      int[] ans = {-1, -1};

      // Boundary check:-
      if(head == null || head.next == null || head.next.next == null){
         return ans;
      }

      ListNode prev = head;
      ListNode curr = head.next;
      ListNode Next = head.next.next;
      
      int count = 1;

      while(Next != null){
        
         if((curr.val > prev.val && curr.val > Next.val) || (curr.val < prev.val && curr.val < Next.val))
           ls.add(count+1);
           count++;
           
         // moving forward if the Node is not the CP..  
         prev = curr;
         curr = Next;
         Next = Next.next;

      }
      if(ls.size() < 2) {
        return ans;
      }

      int min = Integer.MAX_VALUE;

      for(int i = 1 ; i < ls.size(); i++){
          min = Math.min(min, ls.get(i) - ls.get(i-1));
       }

     int lastElement  = ls.get(ls.size()-1);        
     int firstElement = ls.get(0);

      return new int[]{min, lastElement-firstElement};     

     }
}