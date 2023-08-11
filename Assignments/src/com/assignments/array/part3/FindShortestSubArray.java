package com.assignments.array.part3;

import java.util.Map;
import java.util.Collections;
import java.util.HashMap;


public class FindShortestSubArray {

	public static void main(String[] args) {
	      int[] arr={1,2,3,4,4,3,2,2,4};
	    System.out.println("The smallest possible length of a subarray of the given array, that has same degree is: "+findShortestSubArray(arr));
	  }
	public static int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap(),
            right = new HashMap(), count = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (left.get(x) == null) left.put(x, i);
            right.put(x, i);
            count.put(x, count.getOrDefault(x, 0) + 1);
        }
        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
  
}

