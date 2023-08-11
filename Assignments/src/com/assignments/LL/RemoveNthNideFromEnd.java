package com.assignments.LL;

public class RemoveNthNideFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);
		ListNode five = new ListNode(5);

		 one.next = two;
		two.next = three;
		 three.next = four;
		four.next = five;
		ListNode start = removeNthNode(one, 2);
		while(start!=null) {
			System.out.print(start.val+"--> ");
			start = start.next;
		}


	}

	private static ListNode removeNthNode(ListNode head , int n) {
		// TODO Auto-generated method stub
		ListNode temp = head;
		ListNode slow=head,fast=head;
		for(int i=0;i<n;i++) {
			fast = fast.next;
		}
		while(fast.next != null) {
			slow= slow.next;
			fast= fast.next;
			
		}
		slow.next= slow.next.next;
		return temp;
		
	}

}
