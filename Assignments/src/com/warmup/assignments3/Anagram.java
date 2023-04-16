package com.warmup.assignments3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="anagram";
		String t ="nagaram";
		System.out.println(anagram(s,t));
		

	}

	private static boolean anagram(String s, String t) {
		// TODO Auto-generated method stub
		s = s.toLowerCase();
		t = t.toLowerCase();
		if(s.length() != t.length()) return false;
		String one = sort(s.toCharArray());
		String two = sort (t.toCharArray());
		if(one.equals(two)) {
			return true;
		}
		return false;
	}
	
	private static String sort(char[] s) {
		Arrays.sort(s);
		return String.valueOf(s);
		  
	}

}
