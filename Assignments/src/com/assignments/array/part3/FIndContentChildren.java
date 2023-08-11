package com.assignments.array.part3;

import java.util.Arrays;

public class FIndContentChildren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] g = {1,2};int[] s = { 1,2,3};
		System.out.println(findContentChildren(g, s));
	}
	public static int findContentChildren(int[] g, int[] s) {
	      Arrays.sort(g);
	      Arrays.sort(s);
	     int i = 0;
	  for(int j=0;i<g.length && j<s.length;j++) {
		if(g[i]<=s[j]) i++;
	  }
	        
	return i;
	        
	    }

}
