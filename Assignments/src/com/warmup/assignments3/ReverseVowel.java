package com.warmup.assignments3;

public class ReverseVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "No, it never propagates if I set a \\\"gap\\\" or prevention.";
		String s = reverse(str);
		System.out.println(s);

	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		if(str == null || str.length()==0) {
			return "";
		}
		char[] array = str.toCharArray();
		int l = str.length()-1;
		int mid = l/2;
		int i=0;
		int j=l;
		while(i<j) {
			if(isVowel(array[i]) && isVowel(array[j])) {
				swap(i, j,array);
				i++;
				j--;
				
			}
			else if(!isVowel(array[i])) {
				i++;
				
			}else if(!isVowel(array[j])){
				j--;
			}
			else {
				i++;
				j--;
			}
			
		}
		return String.valueOf(array);
		
	} 
	
	private static void swap(int i, int j, char[] array) {
		// TODO Auto-generated method stub
		char temp= array[i];
		array[i]= array[j];
		array[j]= temp;
		
	}

	static boolean isVowel(char c) {
		return ( c== 'a' || c== 'A' || c== 'e' || c== 'E' ||  c== 'i' ||
				c == 'I'||  
				c== 'o' || c== 'O' || c== 'u' || c== 'U');
	
	}

}
