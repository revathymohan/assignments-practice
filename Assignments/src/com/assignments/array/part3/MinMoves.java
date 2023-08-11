package com.assignments.array.part3;

import java.util.Arrays;

public class MinMoves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3};
		int n = minMoves(array);
		System.out.println(n);

	}
	public static int minMoves(int[] nums) {

		int ans = 0;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            if(min > i){
                min = i;
            }
        }
        
        for(int i : nums){
            ans += (i-min);
        }
        
        return ans;
    }
}
