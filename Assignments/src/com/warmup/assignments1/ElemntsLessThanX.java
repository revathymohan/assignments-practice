package com.warmup.assignments1;
/*
 * Given an sorted array A of size N. Find number of elements which are less than or equal to given
element X.
 */
public class ElemntsLessThanX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 2, 3, 5, 8, 9, 11 };
		int x = 5;
		int count = find(array, x);
		System.out.println(count);

	}

	private static int find(int[] arr, int key) {
		 int left = 0;
		    int right = arr.length - 1;
		 
		    int count = 0;
		 
		    while (left <= right)
		    {
		        int mid = (right + left) / 2;
		 
		        // Check if middle element is
		        // less than or equal to key
		        if (arr[mid] <= key)
		        {
		 
		            // At least (mid + 1) elements are there
		            // whose values are less than
		            // or equal to key
		            count = mid + 1;
		            left = mid + 1;
		        }
		 
		        // If key is smaller, ignore right half
		        else
		            right = mid - 1;
		    }
		    return count;
	}
}
