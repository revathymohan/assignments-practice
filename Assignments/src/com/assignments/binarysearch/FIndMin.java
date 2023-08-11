package com.assignments.binarysearch;

public class FIndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		int min = findMin(nums);
		System.out.println(min);
		

	}
	public static int findMin(int[] nums) {
	    int l = 0;
	    int r = nums.length - 1;

	    while (l < r) {
	      final int m = (l + r) / 2;
	      if (nums[m] < nums[r])
	        r = m;
	      else
	        l = m + 1;
	    }

	    return nums[l];
	  }

}
