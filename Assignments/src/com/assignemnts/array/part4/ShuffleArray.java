package com.assignemnts.array.part4;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,1,3,4,7}; 
		/*
		 * 2 3 1 5 4 7
		 * 2 3 5 1 4 7
		 * 2 3 1 5 4 7
		 * 2 3 1 4 5 7
		 * 
		 */
		int n =3;
		for(int k: shuffle(nums, n)) {
			System.out.print(k+" ");//2 3 5 4 1 7
		}

	}
	public static int[] shuffle(int[] nums, int n) {
	        int l = nums.length;
	        int k = l-n;
	        int[] array = new int[l];
	          int j =0;
	          int end = k;
	            for(int i=0;i<end;i++){
	                array[j++]= nums[i];
	                 array[j++]= nums[k];
	                 k++;
	            }

	        
	        return array;
	    }

}
