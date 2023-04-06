package com.warmup.assignments1;
/*
 * Fascinating number
 */
public class FascinatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 192;
		isFascinating(number);

	}

	private static boolean isFascinating(int number) {
		// TODO Auto-generated method stub
		String str = ""+number+number*2+number*3;
		
	for(int i='1';i<='9';i++) {
		//System.out.println(str.indexOf(i));
		int index = str.indexOf(i);
		int isOnlyOnetimePresent = str.lastIndexOf(i);
		if( index == -1 || index != isOnlyOnetimePresent) {
			System.out.println(number+" is not fascinating");
			return false;
		}
	}
	System.out.println(number+" is fascinating");

		return true;
		
	}

}
