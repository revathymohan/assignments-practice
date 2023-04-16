package com.warmup.assignments3;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 19;
		System.out.println(happy(number));

	}

	private static boolean happy(int number) {
		// TODO Auto-generated method stub
		int res= number;
		Set<Integer> set = new HashSet<>();
		while(true) {
			
	           res = isHappy(res);
	          if(res ==1) {
	        	  return true;
	          }
	          if(set.contains(res)) {
	        	  return false;
	          }
				
					set.add(res);
		}
					
		
		
	}
	
	static int isHappy(int n){
		int res =0;
		while(n>0) {
			int dig = n%10;
			n=n/10;
			res= res+dig *dig; 
		}	
		return res;
	}

}
