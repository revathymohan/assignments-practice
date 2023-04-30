package com.warmup.assignments.array1;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {3,0,0};
		int[] nums2 = {4,5};
		int m =nums1.length;
		int n= nums2.length;
		//merge(nums1,nums2, m,n);
		mergeInnum1(nums1,nums2, 1,2);


	}
	private static void mergeInnum1(int[] nums1, int[] nums2, int m, int n) {
		// TODO Auto-generated method stub
		int i = m-1;int j=n-1;
		int k = m+n-1;
		while(k>=0) {
		if(i>=0 && j>=0) {
			if(nums1[i]>nums2[j]) {
				nums1[k--]= nums1[i];
				i--;
			}else {
				nums1[k--]= nums2[j];
				j--;
			}
		}else if(j>=0) {
			nums1[k--]= nums2[j--];
		}
		else {
			break;
		}
		}
for(int p: nums1)
	System.out.println(p);
		
	}
	public static void merge(int[] nums1, int[] nums2, int m, int n) {
       // int[] temp = new int[m+n];
		 int[] temp = new int[m];
	        int j=0;
	        int k=0;
	        int i=0;
	        int size = m-n;
	        while(i<size){
	            if( nums1[i]<= nums2[j]){
	           temp[k++] = nums1[i];
	           i++;

	            }else{
	                temp[k++]= nums2[j];
	                j++;
	            }

	        }
	        for(int p=j;p<n;p++){
	            temp[k++]= nums2[p];
	        }
	        
	        for(int l:temp) {
	        	System.out.println(l);
	        }

	}

	    
    
}


