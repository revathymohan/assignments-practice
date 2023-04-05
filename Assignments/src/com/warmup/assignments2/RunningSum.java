package com.warmup.assignments2;

public class RunningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4};
		int[] sum =runningSum(nums);
		for(int i: sum)
			System.out.println(i);

	}
	    public static int[] runningSum(int[] nums) {
	        int[] sum = new int[nums.length];
	        for(int i=0;i<nums.length;i++){
	            int j=0;
	            while(j<=i){
	             sum[i] = sum[i]+nums[j];
	             j++;
	            }
	        }
	        return sum;
	        
	    
	}
}
