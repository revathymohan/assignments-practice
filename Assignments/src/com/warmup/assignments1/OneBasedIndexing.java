package com.warmup.assignments1;

public class OneBasedIndexing {
/**
 * Given an array Arr of N positive integers.
 *  Your task is to find the elements whose value is equal
to that of its index value ( Consider 1-based indexing )
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1  , 2, 45, 12, 7};
		checkIndex(array);
		

	}

private static void checkIndex(int[] array) {
	// TODO Auto-generated method stub
	for(int i=0;i<array.length;i++) {
		if(array[i]== i+1) {
			System.out.println(i+1);
		}
	}
	
}

}
