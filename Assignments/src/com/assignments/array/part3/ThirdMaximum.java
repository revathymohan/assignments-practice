package com.assignments.array.part3;

public class ThirdMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {12, 13,15, 1, 10, 34, 16};
		int third = thirdMax(array);
		System.out.println(third);

	}

	private static int thirdMax(int[] array) {
		// TODO Auto-generated method stub
		int l = array.length;
		int first = array[0];
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for(int i=1;i<l;i++) {
			if(array[i]>first) {
				third= second;
				second = first;
				first = array[i];
				
			}else if(array[i]> second){
				third = second;
				second= array[i];
				
			}
			else {
				third = array[i];
			}
		}
		return third;
	}

}
