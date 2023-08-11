package com.assignments.array.part2;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] array = intersection(nums1,nums2);
		for(int k: array) {
			System.out.println(k);
		}

	}
    public static int[] intersection(int[] nums1, int[] nums2) {
    	Set<Integer> set1 = new HashSet<>();
    	Set<Integer> set2 = new HashSet<>();

    	for(int i=0;i<nums1.length;i++) {
    		set1.add(nums1[i]);
    	}
    	for(int i=0;i<nums2.length;i++) {
    			if(set1.contains(nums2[i])) {
    				set2.add(nums2[i]);
	
    				}
    	}
		return set2.stream().mapToInt(i->i).toArray();
    }
}
