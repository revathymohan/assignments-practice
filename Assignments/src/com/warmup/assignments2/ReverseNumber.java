package com.warmup.assignments2;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1532189;
		reverse(number);

	}

	private static void reverse(int number) {
		// TODO Auto-generated method stub
		
		int n = number;
		int reverse= 0;
		while(n>0) {
			int digit = n%10;
			n= n/10;
			reverse = reverse*10+ digit;
		}
		System.out.println("Reverse is "+ reverse);
		
	}

}
