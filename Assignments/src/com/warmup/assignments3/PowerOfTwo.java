package com.warmup.assignments3;
/*
 * Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 0;
System.out.println(isPowerOfTwo(n));
	}

	private static boolean isPowerOfTwo(int n) {
		// TODO Auto-generated method stub
		if( n ==0)
			return false;
		while(n%2 == 0) {
			n/=2;
		}
		if(n == 1)
			return true;
		return false;
		
		
	}

}
