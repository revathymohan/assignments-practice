package com.warmup.assignments1;

import java.util.Arrays;
/*
 * Given an array of N distinct elements, the task is to find all elements in array except two greatest
elements in sorted order.
 */
public class GreatesElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 7, -2, 3, 4, 9, -1 };
		printAllExcept2GreaterElements(array);

	}

	private static void printAllExcept2GreaterElements(int[] array) {
		// TODO Auto-generated method stub
		if (array == null || array.length == 0) {
			System.out.println("Array is not valid");
			return;
		}

		int l = array.length;
		if (l == 1 || l == 2) {
			System.out.println("Array length should be greater than 2");
			return;
		}
		Arrays.sort(array);
		for (int i = 0; i < l - 2; i++) {
			System.out.println(array[i]);
		}

	}

}
