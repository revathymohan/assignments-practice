package com.warmup.assignments1;
/*
 * Find series sum
 */

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findSum(n);

	}

	private static void findSum(int n) {
		// TODO Auto-generated method stub
		
		int sum = n*(n+1)/2;
		System.out.println(sum);
		
	}

}
