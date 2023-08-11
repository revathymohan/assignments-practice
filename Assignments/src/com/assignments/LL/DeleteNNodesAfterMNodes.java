package com.assignments.LL;

public class DeleteNNodesAfterMNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(3);
		ListNode four = new ListNode(4);

		 one.next = two;
		two.next = three;
		// three.next = four;
		//four.next = five;
		ListNode node = delete(one, 2,2);
		display(node);
	}

	private static void display(ListNode start) {
		// TODO Auto-generated method stub
		while(start!=null) {
			System.out.print(start.val+"--> ");
			start = start.next;
		}

		
	}

	private static ListNode delete(ListNode head, int n, int m) {
		// TODO Auto-generated method stub
		ListNode temp = head;
		ListNode fast = head;
		ListNode slow = head;

		
		for(int i=1;i<m && fast!= null ;i++) {
			fast = fast.next;
		}
		if( fast == null ) return temp;
		slow = fast;
		for(int j=0;j<n && slow!=null ;j++) {
			slow= slow.next;
		}
		if( slow == null) return temp;
		fast.next = slow.next;
		return temp;
		
		
	}

}
