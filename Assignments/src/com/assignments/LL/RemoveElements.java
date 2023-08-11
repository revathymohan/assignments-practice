package com.assignments.LL;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode one = new ListNode(2);
		ListNode two = new ListNode(4);
		ListNode three = new ListNode(6);
		ListNode four = new ListNode(4);
		 head.next = one ;
		 one.next = two;
		two.next = three;
		 three.next = four;
		four.next = null;
		
ListNode start = removeElements(head, 4);
while(start!=null) {
	System.out.print(start.val+"--> ");
	start = start.next;
}

	}
	public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode start = temp;

        while(start.next != null){
           
            if(start.next.val == val){
            start.next = start.next.next;
            }
        else {

        start = start.next;
            }

    
        
    }
            return temp.next;
    }

}
