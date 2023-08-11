package com.assignments.dp;

import java.util.Arrays;

public class ClimbingStarirs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int[] dp = new int[n+1];
		Arrays.fill(dp,-1);

		int l = climb(n, dp);
		System.out.println(l);

	}

	private static int climb(int n, int[] dp) {
		// TODO Auto-generated method stub
		if( n==0 || n==1) return 1;
		
		if(dp[n] != -1) return dp[n];
		dp[n]= dp[n-1]+dp[n-2];
		return n;
		
		
		
	}

}
