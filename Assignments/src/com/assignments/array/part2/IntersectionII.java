package com.assignments.array.part2;

import java.util.Arrays;

public class IntersectionII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {4,9,5};
		int[] nums2= {9,4,9,8,4};
		int[] intersect = intersect(nums1, nums2);
		for(int i: intersect)
			System.out.println(i);
		

	}

	 public static int[] intersect(int[] nums1, int[] nums2) {
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        int l1 = nums1.length;
	        int l2 = nums2.length;
	        int i=0,j=0,k=0;
	        while(i<l1 && j<l2){
	            if(nums1[i] < nums2[j]){
	                i++;
	            }else if(nums1[i]> nums2[j]){
	                j++;
	            }else {
	                nums1[k++]= nums1[i++];
	                j++;
	            }
	        }
	       return Arrays.copyOfRange(nums1,0,k);
	        
	    }
}
