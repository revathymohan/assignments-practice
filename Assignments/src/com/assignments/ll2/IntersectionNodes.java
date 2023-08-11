package com.assignments.ll2;

public class IntersectionNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head1 = new ListNode(4);
		head1.next = new ListNode(1);
		head1.next.next = new ListNode(8);
		head1.next.next.next = new ListNode(4);
		head1.next.next.next.next = new ListNode(5);

		ListNode head2 = new ListNode(5);
		head2.next = new ListNode(6);
		head2.next.next = new ListNode(1);
		head2.next.next.next = new ListNode(8);
		head2.next.next.next.next = new ListNode(4);
		head2.next.next.next.next.next = new ListNode(5);

		ListNode node = getIntersectionNode(head1, head2);
		System.out.println(node);

	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode first = headA;
		ListNode second = headB;
		ListNode temp1 = headA;
		ListNode temp2 = headB;
		int count1 = 0, count2 = 0;
		while (first != null) {
			count1++;
			first = first.next;
		}
		while (second != null) {
			count2++;
			second = second.next;
		}
		int diff = Math.abs(count1 - count2);
		if (count1 > count2) {
			for (int i = 0; i < diff; i++) {
				if (temp1 == null) {
					break;
				}
				temp1 = temp1.next;
			}

		} else {
			for (int j = 0; j < diff; j++) {
				if (temp2 == null) {
					break;
				}
				temp2 = temp2.next;
			}

		}
        ListNode intersect  = null;
		while (temp1 != null && temp2 != null) {
			if (temp1.val == temp2.val && temp1==temp2) {
				return temp1;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
		return null;
    }

}
