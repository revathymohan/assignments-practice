package com.warmup.assignments1;
/*
 * Given an array of even size N, task is to find minimum value that can be added to an element so that
array become balanced. An array is balanced if the sum of the left half of the array elements is equal
to the sum of right half.
 */
public class LeftAndRightSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 1, 2, 1, 3 };
		numberToAdd(array);

	}

	private static void numberToAdd(int[] array) {
		// TODO Auto-generated method stub
		if(array==null || array.length ==0) {
			System.out.println("Array is not valid");
			return;
		}
		int mid = (array.length-1)/2;
		int sum1=0,sum2=0;
		int i=0;
		for( i=0;i<=mid;i++) {
			sum1+=array[i];
		}
		for(int j=i;j<array.length;j++) {
			sum2+=array[j];
		}
		int diff = sum2>=sum1 ? sum2-sum1 : sum1-sum2;
		System.out.println("The element to be added ---> "+diff);
		
		
	}

}
