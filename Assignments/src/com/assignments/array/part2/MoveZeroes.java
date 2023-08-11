package com.assignments.array.part2;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);

	}
	 public static void moveZeroes(int[] nums) {
	        int l = nums.length;
	        for(int i=0;i<l-1;i++){
	            int first = nums[i];
	            int j=i;
	            while(j<l-1 && nums[j]==0){

	                j++;
	            }
	            int temp = nums[i];
	            nums[i]= nums[j];
	            nums[j]= temp;
	            

	        }
	        for(int i: nums) {
	        	System.out.println(i);
	        }
	        
	    }
}
