package com.warmup.assignments1;
/*
 * You are given an array A of size N. You need to print elements of A in alternate order (starting
from index 0).
 */
public class AlternateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,5,6,3,7,11,34};
		print(array);

	}

	private static void print(int[] array) {
		// TODO Auto-generated method stub
		int n= array.length;
		for(int i=0;i<n;i+=2) {
			System.out.println(array[i]);
		}
		
	}

}
