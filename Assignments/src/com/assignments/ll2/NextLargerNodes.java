package com.assignments.ll2;

import java.util.*;

public class NextLargerNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] nextLargerNodes(ListNode head) {
		ListNode temp = head;
		List<Integer> list = new ArrayList<Integer>();
		while (temp != null) {
			ListNode t = temp.next;
			while (t != null) {
				if (t.val > temp.val) {
					list.add(t.val);
					break;
				}
				t = t.next;

			}
			if (t == null)
				list.add(0);
			temp = temp.next;
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		return arr;

	}

}
