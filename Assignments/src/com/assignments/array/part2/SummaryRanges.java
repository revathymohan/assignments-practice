package com.assignments.array.part2;

import java.util.List;
import java.util.ArrayList;


public class SummaryRanges {

	public static void main(String[] args) {
		SummaryRanges obj = new SummaryRanges();
		// TODO Auto-generated method stub
		int[] nums = {0,2,3,4,6,8,9};
		List<String> l = obj.summaryRanges(nums);
		l.stream().forEach(System.out::println);
		

	}
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<String>();
		int n = nums.length;
		int j =0;
		int i=0;
		for( i=0;i<n-1;i++) {
			 j = i;
			while(j < n-1 && nums[j+1]- nums[j] == 1) {
				j++;
				
			}
		    if( i ==j){
		     	list.add(String.format(""+ nums[j]));
		   
		    }else{
			list.add(String.format("%d->%d", nums[i], nums[j]));

		    }
			i=j++;
		}
		if(i == n-1) {
			list.add(String.format(""+ nums[n-1]));
	
		}

		return list;

			
	}
}
