package com.assignments.array.part3;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,4,5,2,5};
		//System.out.println(singleNumber(nums));
		System.out.println(singleNumber(nums, nums.length));


	}

	private static int singleNumber(int[] nums) {
		// TODO Auto-generated method stub
		int xor=0;
		for(int i: nums) {
			xor^=i;
		}
		return xor;
	}
	private static int singleNumber(int[] array, int n) {
		// TODO Auto-generated method stub
		int xor=0;
		int num=0;
		Arrays.sort(array);
		for(int i=1;i<n-1;i++) {
			if( array[i-1] != array[i] && array[i] != array[i+1]) {
				num= array[i];
			}
		}
		return num;
	}
	
}
