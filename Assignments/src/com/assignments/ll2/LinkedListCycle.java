package com.assignments.ll2;

public class LinkedListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode detectCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast = head;
  boolean flag = true ;
        while(slow!= null && fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = false;
                break;

            }
        }
        if(flag) return null;
         slow= head;
         while(slow!= null && fast!= null){
             if(slow == fast){
                 return slow;
             }
             slow = slow.next;
             fast = fast.next;
             
         }
       return null; 
    }

}
