package com.warmup.assignments2;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,0,12};
		moveZeroes(nums);
		

	}

	private static void moveZeroes(int[] nums) {
		// TODO Auto-generated method stub
		int l = nums.length;
		for(int i=0;i<l-1;i++) {
			int num = nums[i];
			int j=i;
			while(j<l-1 &&nums[j]==0) {
				j++;
			}
			int temp = nums[j];
			nums[j] = nums[i];
			nums[i]=temp;
			
		}
		for(int a: nums)
			System.out.println(a);
		
	}

}
