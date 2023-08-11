package com.assignments.ll2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(4);
       ListNode node = deleteDuplicates(head);
       while(node != null) {
    	   System.out.println(node.val);
    	   node = node .next;
       }
	}
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (head != null) {
	if (head.next != null && head.val == head.next.val) {
                // skipping the duplicate nodes
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                temp.next = head.next;
            }
            else {
                temp.next = head;
                temp = temp.next;
            }

            head = head.next;
        }
        return dummy.next;
	    }
}
