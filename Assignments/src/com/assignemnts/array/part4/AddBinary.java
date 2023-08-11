package com.assignemnts.array.part4;

public class AddBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "11", b = "100";
		System.out.println(addBinary(a, b));
	}

	private static String addBinary(String A, String B) {
		// TODO Auto-generated method stub
		// initialize the ith index
        int i = A.length()-1;
        // initialize the jth index
        int j = B.length()-1;
        // initialize the carry
        int carry = 0;
      // initialize the sum
        int sum = 0;
        StringBuilder result =  new StringBuilder();
        while(i>=0 || j>=0 || carry == 1){
            sum = carry;
            if(i>=0) sum = sum+A.charAt(i)-'0';
            if(j>=0) sum = sum+B.charAt(j)-'0';
            result.append((char)(sum%2+'0'));
            carry = sum/2;
            i--;
            j--;
        }
        return result.reverse().toString();

		
	}

}
