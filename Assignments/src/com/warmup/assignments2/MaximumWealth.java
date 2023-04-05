package com.warmup.assignments2;

public class MaximumWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts = { { 1, 2, 3 }, { 4, 1, 6 } };
		int max = maximumWealth(accounts);
		System.out.println(max);

	}

	public static int maximumWealth(int[][] accounts) {
		int max = 0;
		for (int i = 0; i < accounts.length; i++) {
			int sum = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				sum = sum + accounts[i][j];
				if (sum > max) {
					max = sum;
				}

			}
		}
		return max;

	}
}
