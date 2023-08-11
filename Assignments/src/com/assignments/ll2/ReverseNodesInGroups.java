package com.assignments.ll2;

public class ReverseNodesInGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		head.next = two;
		two.next = three;
		three.next = four;

		ListNode node = reverseInGroups(head, 2);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}

	}

	private static ListNode reverseInGroups(ListNode head, int k) {
		// TODO Auto-generated method stub
		if(head == null)
	          return null;
	        ListNode current = head;
	        ListNode next = null;
	        ListNode prev = null;
	  
	        int count = 0;
	  
	        /* Reverse first k nodes of linked list */
	        while (count < k && current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	            count++;
	        }
	  
	        /* next is now a pointer to (k+1)th node
	           Recursively call for the list starting from
	           current. And make rest of the list as next of
	           first node */
	        if (next != null)
	            head.next = reverseInGroups(next, k);
	  
	        // prev is now head of input list
	        return prev;
	}

}
