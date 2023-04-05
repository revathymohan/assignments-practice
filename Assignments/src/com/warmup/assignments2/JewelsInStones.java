package com.warmup.assignments2;

public class JewelsInStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jewels="Aa";
		String stones ="aAbBccc";
		findNum(jewels,stones);

	}

	private static void findNum(String jewels, String stones) {
		// TODO Auto-generated method stub
		int len1= jewels.length();
		int len2 = stones.length();
		int total=0;
		for(int i=0;i<len1;i++) {
			char c = jewels.charAt(i);
			int j=0;
			int count=0;
			while(j< stones.length()) {
				if( c == stones.charAt(j)) {
					count++;
					
				}
				j++;
				
			}
			total += count;
		
		}
		System.out.println(total);
		
	}

	
}
