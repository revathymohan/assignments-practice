package com.assignments.ll2;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list1 = new ListNode();
        list1.next = new ListNode(2);
        ListNode list2 = new ListNode();
        list2 = new ListNode(1);
        ListNode n = mergeTwoLists(list1, list2);
        ListNode temp = n.next;
        while(temp!= null) {
        	System.out.print(temp.val);
           temp = temp.next;
        }
        	

	}
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(0);
        ListNode current = node;
        while(list1 != null && list2 != null){
            if(list1.val<=list2.val){
            if(list1!= null){
                current.next = list1;
                current= current.next;
                list1 = list1.next;
            }
            }else{
            if(list2 != null){
                current.next = list2;
                current= current.next;
                list2= list2.next;
            }
            }
           
        }
        if(list1!= null){
            current.next= list1;
        } else{
            current.next= list2;
        }
        return node.next;
        
    }

}
