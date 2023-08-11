package com.assignments.ll2;

public class AddTwoPolinomials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1 = new ListNode(2);
		 head1.next = new ListNode(4);
		 head1.next.next = new ListNode(3);


		ListNode head2 = new ListNode(5);
		 head2.next = new ListNode(6);
		 head2.next.next = new ListNode(4);


		ListNode list = add(head1, head2);
		display(list);

	}

	public static void display(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;

		}
	}

	private static ListNode add(ListNode head1, ListNode head2) {
		// TODO Auto-generated method stub
		ListNode l1 = reverse(head1);
		ListNode l2 = reverse(head2);
	
		int carry = 0;
		ListNode sumNode = new ListNode();
		ListNode head = sumNode;

		while (l1 != null || l2 != null || carry>0) {
			int sum = 0;
			sum += l1 != null ? l1.val : 0;
			sum += l2 != null ? l2.val : 0;
			sum = sum + carry;
			carry = sum / 10;
			sum = sum % 10;
			sumNode.val = sum;
			ListNode temp = new ListNode();
			sumNode.next = temp;
			sumNode = temp;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;

		}

		ListNode t = head;
	
		while (t.next != null && t.next.next != null) {
			t = t.next;
		}
		if (t.next.val == 0) {
			t.next = null;

		}
		

		ListNode revSum = reverse(head);

		return revSum;
	}

	private static ListNode reverse(ListNode head) {
		// TODO Auto-generated method stub

		ListNode next = null;
		ListNode current = head;
		ListNode prev = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		return prev;

	}

}
