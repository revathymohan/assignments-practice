package com.warmup.assignments2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,2,1,3};
		findDiff(array);

	}

	private static void findDiff(int[] array) {
		// TODO Auto-generated method stub
		List<List<Integer>> list = new ArrayList<>();
		int min=Integer.MAX_VALUE;
		Arrays.sort(array);
		int l = array.length;
		for(int i=0;i<l-1;i++) {
			int diff = Math.abs(array[i+1] - array[i]);
			if(diff < min) {
				min = diff;
			}
		}
		for(int i=0;i<l-1;i++) {
			List<Integer> listSub = new ArrayList<>();
			int diff = Math.abs(array[i+1] - array[i]);
			if(diff == min) {
				listSub.add(array[i+1]);
				listSub.add(array[i]);
				list.add(listSub);
			}
		}
		
		for(List<Integer> k : list) {
			System.out.print("[");
			for(int s: k) {
			System.out.print(s+" ");
			}
			System.out.println("]");

		}
		
	}

}
