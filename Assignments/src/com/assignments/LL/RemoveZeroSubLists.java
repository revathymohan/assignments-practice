package com.assignments.LL;
import java.util.*;

public class RemoveZeroSubLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode one = new ListNode(1);
		ListNode two = new ListNode(2);
		ListNode three = new ListNode(-2);
		ListNode four = new ListNode(1);
		ListNode five = new ListNode(1);
		one.next = two;
		two.next = three;
		three.next = four;
		//four.next = five;
		ListNode head = removeZeroSumSublists(one);
		display(head);
	}
	private static void display(ListNode start) {
		// TODO Auto-generated method stub
		while(start!=null) {
			System.out.print(start.val+"--> ");
			start = start.next;
		}

		
	}
		public static ListNode removeZeroSumSublists(ListNode head) {
			Map<Integer, ListNode> m = new HashMap();
	        
	        ListNode temp=head;
	        
	        
	        ListNode dummy= new ListNode(0);
	        dummy.next=head;
	        
	        m.put(0,dummy);
	        int sum=0;
	        while(temp!=null)
	        {
	          sum=sum+temp.val;
	            if(m.containsKey(sum))
	            {
	                ListNode x = m.get(sum).next;
	              m.get(sum).next=temp.next;  
	                
	               
	                int g=sum;
	                while(x!=temp)
	                {
	                   
	                    m.remove(g+x.val);
	                     g=g+x.val;
	                    x=x.next;
	                    
	                }
	                
	                
	            }
	           else
	            m.put(sum,temp);

	            
	            temp=temp.next;
	        }
	        
	     return dummy.next;   
	    }

}
