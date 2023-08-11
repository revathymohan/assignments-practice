package com.assignements.recursion;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println(isPowerOfTwo(n));

	}
	 public static boolean isPowerOfTwo(int n) {
		 
		 while(n% 2 ==0) {
			 n/=2;
		 }
		 if(n ==1)
			 return true;
		return false;
	 }
	 
}
