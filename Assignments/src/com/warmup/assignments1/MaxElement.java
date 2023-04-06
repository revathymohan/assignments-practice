package com.warmup.assignments1;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,100,-10,4598888};
		System.out.println(maxElement(array));
		

	}

	private static int maxElement(int[] array) {
		// TODO Auto-generated method stub
		if(array == null || array.length ==0)
			return -1;
		
		int max = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>=max) {
				max = array[i];
			}
		}
		return max;
	}

}
