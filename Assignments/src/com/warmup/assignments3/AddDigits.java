package com.warmup.assignments3;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =38;
		System.out.println(addDigits(num));

	}

	private static int addDigits(int num) {
		// TODO Auto-generated method stub
		
		if(num ==0) return 0;
		
		return num%9 ==0? 9: num%9;
		
	}

}
