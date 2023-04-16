package com.warmup.assignments3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {2,2,3,1,4};
		System.out.println(thirdMax(num));

	}

	private static int thirdMax(int[] num) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		if(num == null || num.length ==0)
			return 0;
		Arrays.sort(num);
		for(int i: num) {
			set.add(i);
			if(set.size() >3) {
				set.remove(Collections.min(set));
			}
			
		}
		if(set.size() ==3) {
			return Collections.min(set);
		}
		
		return Collections.max(set);
	

		
	}

}
