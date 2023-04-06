package com.warmup.assignments1;
/*
 * Perfect  array
 */
public class PerfectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,6,4,3,2,1};
		if(perfect(array)) {
			System.out.println("PERFECT");
		}else{
			System.out.println("NOT PERFECT");

		}

	}

	private static boolean perfect(int[] array) {
		// TODO Auto-generated method stub
		int len = array.length-1;
		int n = len/2, i=0, j=len;
		while(i<=n) {
			if(array[i] != array[j]) {
				return false;
				
			}
			else {
              i++;
              j--;
			}
			
		}
		return true;
		
	}

}
