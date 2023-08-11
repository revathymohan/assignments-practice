package com.assignments.array.part2;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,1,1};int k =1;
		System.out.println(containsDuplicate(nums ,k));

	}

	private static boolean containsDuplicate(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int l = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<l;i++) {
			if(map.containsKey(nums[i])){
	            int pre = map.get(nums[i]);
	            if(i-pre<=k)
	                return true;
	        }
	 
	        map.put(nums[i], i);
	    }
	 
		
		return false;
		
	}

}

