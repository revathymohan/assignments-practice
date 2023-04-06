package com.warmup.assignments1;

import java.util.Arrays;
/**
 * Given an array of length N, at each step it is reduced by 1 element. In the first step the maximum
element would be removed, while in the second step minimum element of the remaining array would
be removed, in the third step again the maximum and so on. Continue this till the array contains only 1
element. And find the final element remaining in the array.
 * @author revathimattakkuda
 *
 */
public class RemoveElementsOneByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array =  {8, 1, 2, 9, 4, 3, 7, 5};
		//1 2 3 4 5 7 8 9
		findLastElementAfterRemoval(array);

	}

	private static void findLastElementAfterRemoval(int[] array) {
		// TODO Auto-generated method stub
		if( array == null || array.length ==0) {
			System.out.println("No elements present");
		}
		int n = array.length;
		Arrays.sort(array);
		if(n%2 ==0) {
			System.out.println("Last element to be removed : "+ array[n/2-1]);
		}
		else {
			System.out.println("Last element to be removed : "+ array[n/2]);

		}
	}

}
