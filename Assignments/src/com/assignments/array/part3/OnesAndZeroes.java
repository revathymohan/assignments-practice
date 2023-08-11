package com.assignments.array.part3;

public class OnesAndZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"10","0001","111001","1","0"};
		findMaxForm(strs, 5,3);

	}
	 public static int findMaxForm(String[] S, int M, int N) {
	        int[][] dp = new int[M+1][N+1];
	        for (String str : S) {
	            int zeros = 0, ones = 0;
	            for (char c : str.toCharArray())
	                if (c == '0') zeros++;
	                else ones++;
	            for (int i = M; i >= zeros; i--)
	                for (int j = N; j >= ones; j--)
	                    dp[i][j] = Math.max(dp[i][j], dp[i-zeros][j-ones] + 1);
	        }
	        return dp[M][N];
	    }
}
