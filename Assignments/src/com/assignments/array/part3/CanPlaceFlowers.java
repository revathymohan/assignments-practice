package com.assignments.array.part3;

public class CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {1,0,0,0,1,0,1};
		int n=1;
		System.out.println(canPlaceFlowers(flowerbed, n));

	}

	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	        if (flowerbed == null || n > flowerbed.length / 2 + 1) return false;
	        int count = 0;
	        for (int i = 0; i < flowerbed.length && count < n; i++) {
	            if (flowerbed[i] == 0) {
	                int prev = i == 0 ? 0 : flowerbed[i - 1];
	                int next = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
	                if (prev == 0 && next == 0) {
	                    flowerbed[i] = 1;
	                    count++;
	                }
	            }
	        }
	        return count == n;
	    }
}
