package com.assignments.ll2;

public class RotateRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(3);
		list1.next.next.next = new ListNode(4);
		list1.next.next.next.next = new ListNode(5);
	ListNode t = rotateRight(list1, 2);
	display(t);

	}

	public static ListNode rotateRight(ListNode head, int k) {
		ListNode current = head;
		int count = 1;
		while (current != null && count < k) {
			current = current.next;
			count++;
		}
		if (current == null)
			return head;
		ListNode kthNode = current;
		  
        // current will point to last node after this loop
        // current will point to node 60 in the above
        // example
        while (current.next != null)
            current = current.next;
  
        // Change next of last node to previous head
        // Next of 60 is now changed to node 10
  
        current.next = head;
  
        // Change head to (k+1)th node
        // head is now changed to node 50
        head = kthNode.next;
  
        // change next of kth node to null
        kthNode.next = null;
        return head;
	}

	private static void display(ListNode first) {
		// TODO Auto-generated method stub
		ListNode n = first;
		while (n != null) {
			System.out.print(n.val + "-> ");
			n = n.next;
		}

	}
}
