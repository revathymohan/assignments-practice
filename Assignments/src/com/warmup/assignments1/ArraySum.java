package com.warmup.assignments1;

public class ArraySum {
/**
 *  Given an array of N integers. Your task is to print the
 *   sum of all of the integers.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] array = {2,5,1,8,9};
        sum(array);
	}

private static void sum(int[] array) {
	// TODO Auto-generated method stub
	int sum=0;
	for(int i: array) {
		sum += i;
		
	}
	System.out.println(sum);
	
}

}
