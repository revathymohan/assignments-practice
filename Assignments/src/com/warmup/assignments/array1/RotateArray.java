package com.warmup.assignments.array1;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7};
		int k=3;
		rotate(nums, k);

	}

	public static void rotate(int[] nums, int k) {
		int n = nums.length;
		int i = 0;
		if (k > nums.length) {
			k = k % nums.length;
		}
		int j = n;
		int start =0;
		int end = n-k-1;
		while(start<=end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
		int start1 = n-k;
		int end1 = n-1;
	
		while(start1<=end1) {
			int temp = nums[start1];
			nums[start1] = nums[end1];
			nums[end1] = temp;
			start1++;
			end1--;
		}
		int start2 = 0;
		int end2 = n-1;
	
		while(start2<=end2) {
			int temp = nums[start2];
			nums[start2] = nums[end2];
			nums[end2] = temp;
			start2++;
			end2--;
		}

		
		
		for(int e:nums) {
			System.out.println(e);
		}

	}

	
}
