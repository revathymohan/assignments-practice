package com.warmup.assignments.array1;
import java.util.*;

public class MajorityNByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		majorityElement(nums).stream().forEach(System.out::println);

	}

	private static List<Integer> majorityElement(int[] nums) {
		// TODO Auto-generated method stub
		List<Integer>list = new ArrayList<Integer>();
		int num1=-1,num2=-1,count1=0,count2=0;
		int n = nums.length;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]== num1) {
				count1++;
			}else if(nums[i]== num2) {
				count2++;
			}else if(count1 ==0) {
				num1 = nums[i];
				count1++;

			}else if(count2 ==0) {
				num2= nums[i];
				count2++;
			}else {
				count1--;
				count2--;
			}
		}
		count1=0;
		count2=0;
		for(int j=0;j<nums.length;j++) {
			if(nums[j]==num1) {
				count1++;
			}else if(nums[j] == num2) {
				count2++;
			}
		}
		if(count1>n/3) {
			list.add(num1);
		}
		if(count2>n/3) {
			list.add(num2);
		}
		return list;
	
	}

}
