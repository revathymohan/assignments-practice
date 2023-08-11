package com.assignments.array.part2;

public class NumArray {
	 private int[] nums;

	public NumArray(int[] nums) {
	        this.nums = nums;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums = {-2, 0, 3, -5, 2, -1};
	NumArray obj = new NumArray(nums);
	int sum = obj.sumRange(0, 2);
	System.out.println(sum);
	
	}
    
    public int sumRange(int left, int right) {
        int sum =0;
        for(int i=left;i<=right;i++){
        sum+=nums[i];
        }
        return sum;
        
    }
}
