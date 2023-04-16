package com.warmup.assignments2;

import java.util.ArrayList;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line = 5;
		ArrayList<Long>l = nthRowOfPascalTriangle(line);
		for(Long k: l) {
			System.out.println(k);
		}

	}

	static ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
		ArrayList<Long> prev = new ArrayList<Long>();
		
		prev.add((long) 1);
			if(n==1){
         	    return prev;
         	}
		prev.add((long) 1);
	
		if(n==2){
		    return prev;
		}
         int i=2;
         
         ArrayList<Long> current = null;
		for( i=2;i<=n-1;i++) {
			current = new ArrayList<>();
			current.add((long) 1);

			for(int j=1;j<i;j++) {
				current.add((prev.get(j-1)+prev.get(j))%1000000007);
			}
			current.add((long) 1);
			prev = current;

		}
   
		return  current;
        }
    
    
   
}
