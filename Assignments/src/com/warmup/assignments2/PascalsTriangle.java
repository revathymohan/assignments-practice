package com.warmup.assignments2;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line = 5;
		pascalTriangle(line);
		printRow(line);

	}

	private static void printRow(int line) {
		// TODO Auto-generated method stub
		for(int j=0;j<=line-1;j++){
			int res = factorial(line-1)/
					(factorial((line-1-j)) * factorial(j));
			System.out.print(res+" ");	
		}
		
	}

	private static void pascalTriangle(int line) {
		// TODO Auto-generated method stub
          for(int i=0;i<line;i++) {
        	  for(int k=0;k<line-i;k++) {
        		  System.out.print(" ");
        	  }
			for(int j=0;j<=i;j++) {
				int res = factorial(i)/
						(factorial((i-j)) * factorial(j));
			}
			System.out.println();
          }

		
	}
	
	public static int factorial(int d) {
	    if (d == 0) {
	        return (1);
	    }
	    return d * factorial(d - 1);
	}

}
