package com.warmup.assignments.array1;

import java.util.Arrays;

public class ThreeSumSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,1,3,4,7};
		int target = 12;
		int count = threeSumSmaller(nums,target);
		System.out.println("Count --> "+count);

	}
	public static int threeSumSmaller(int[] nums, int target) {
        // Write your code here
        int n = nums.length;
        Arrays.sort(nums);
        int count =0;
        for(int i=0;i<n;i++){
            int j =i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum < target){
                	System.out.println(sum);
                    k--;
                }else{
                	count = count+(k-j);
                    j++;
                }
            }
        }
        return count;
    }

}
