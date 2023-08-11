package com.assignments.ll2;

import com.assignments.ll2.*;

public class ReOrderLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ListNode list = new ListNode();
	        list.head = new ListNode(1);
	        list.head.next = new ListNode(2);
	        list.head.next.next = new ListNode(3);
	        list.head.next.next.next = new ListNode(4);
	        list.head.next.next.next.next = new ListNode(5);
	        reArrange(list.head);
	}

	private static void reArrange(ListNode head) {
		// TODO Auto-generated method stub
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode slow=head,fast=head;
		while(fast!=null && fast.next!=null) {
			slow= slow.next;
			fast = fast.next.next;
			
		}
		ListNode node = slow.next;
		ListNode node2 = reverse(node);
		rearrange(head, node2 , dummy);
		
		
		
		
	}

	private static void rearrange(ListNode node1, ListNode node2 , ListNode current) {
		// TODO Auto-generated method stub
		while(node1!=null || node2!=null) {
			if(node1 != null) {
				current.next = node1;
				current = node1.next;
				node1= node1.next;
			}
			if(node2 != null) {
				current.next = node2;
				current = node2.next;
				node2= node2.next;
			}
		}
		
	}

	private static ListNode reverse(ListNode head) {
		// TODO Auto-generated method stub
		
		ListNode next = null;
		ListNode current = head;
		ListNode prev= null;
		
		while(next != null) {
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
           	
			
		}
		return prev;
		
		
		
	}

}
