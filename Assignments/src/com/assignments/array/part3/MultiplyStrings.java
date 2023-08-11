package com.assignments.array.part3;

import java.util.Vector;

public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiply("20","2");

	}
	public static  String multiply(String nums1, String nums2) {
	    int[] products = new int[nums1.length() + nums2.length()];
	    for(int i = nums1.length()-1; i >= 0; i--)
	        for(int j = nums2.length()-1; j >= 0; j--)
	            products[i+j+1] += (nums1.charAt(i) - '0') * (nums2.charAt(j) - '0');

	    int carry = 0;
	    StringBuilder sb = new StringBuilder();
	    for(int i = products.length-1; i >= 0; i--) {
	        sb.insert(0, (products[i]+carry)%10);
	        carry = (products[i]+carry)/10;
	    }

	    while (sb.length() != 0 && sb.charAt(0) == '0') 
	        sb.deleteCharAt(0);

	    return sb.length() == 0 ? "0" : sb.toString();
	
        
    }
	public String multiply2(String num1, String num2) 
    {
        int uno = num1.length();
        int dos = num2.length();
        int[] tgt = new int[uno + dos];
        
        for (int i = uno - 1; i >= 0; i--)
        {
            int curr = num1.charAt(i) - '0';
            
            for (int j = dos - 1; j >= 0; j--)
            {
                int mult = curr * (num2.charAt(j) - '0');
                int sum = mult + tgt[i + j + 1];
                tgt[i + j] += sum / 10;
                tgt[i + j + 1] = sum % 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int n : tgt)
        {
            if (!(sb.length() == 0 && n == 0))
            {
                sb.append(n);
            }
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
