package com.warmup.assignments3;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int n = 9;
       System.out.println( isUgly(n));
	}

	private static boolean isUgly(int n) {
		// TODO Auto-generated method stub
		
		while(n%2 ==0) {
			n=n/2;
		}
		while(n%3 ==0) {
			n=n/3;
		}
		while(n%5 ==0) {
			n=n/5;
		}
		if(n ==1) {
			return true;
		}
		return false;
		
}
}
