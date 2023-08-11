package com.assignments.array.part2;

public class NextGreatElementCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1};
		int[] a = nextGreaterElements(nums);
		for(int i:a)
			System.out.println(i);

	}

	public static int[] nextGreaterElements(int[] nums) {
		int[] array = new int[2 * nums.length];
		int n = nums.length;
		for (int i = 0; i < array.length; i++) {
			array[i] = nums[i % n];
		}
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < (2 * n) - 1; j++) {
				if (array[i] < array[j]) {
					nums[i] = array[j];
					flag=false;
					break;
				}else {
					 flag = true;
				}
			}
			if(flag) nums[i]=-1;
		}
		return nums;
	}
}
