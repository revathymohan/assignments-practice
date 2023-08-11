package com.assignments.ll2;

public class HasCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
        return false;
        ListNode slow = head, fast = head;
        ListNode temp = head;
        while(slow != null && fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }

        }
        return false;
        
    }
}
