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
		if (number<0) {
			n = -1* number;
		}
		int reverse= 0;
		while(n>0) {
			int digit = n%10;
			n= n/10;
			reverse = reverse*10+ digit;
		}
		if (number<0) {
			reverse = -1* reverse;
		}
		System.out.println("Reverse is "+ reverse);
		
	}

}
