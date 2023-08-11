package com.assignments.ll2;

public class OddEvenList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(4);
       head.next.next.next.next = new ListNode(5);
       
       ListNode node = oddEvenList(head);
       while(node != null) {
    	   System.out.print(node.val+"-> ");
    	   node = node .next;
       }

	}
	public static ListNode oddEvenList(ListNode head) {
		ListNode odd = head;
        ListNode even = head.next;
        ListNode odd_head = head;
        ListNode even_head = head.next;
        
        while(even!= null && even.next!=null)
        {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = even_head;        
        return head;
    }}
