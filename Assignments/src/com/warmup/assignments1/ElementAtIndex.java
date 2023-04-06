package com.warmup.assignments1;

import java.util.Scanner;
/**
 * Given an array A[] of N integers and an index Key. Your task is to print the element present at
index key in the array.
 * 
 *
 */
public class ElementAtIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];

		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}

		System.out.println("Enter the element index to find out");
		int index = sc.nextInt();
		
      findElement(array, index);
	}

	private static void findElement(int[] array, int index) {
		// TODO Auto-generated method stub
	int element = array[index];
	System.out.print("The number is "+ element);
		

		
	}

}
