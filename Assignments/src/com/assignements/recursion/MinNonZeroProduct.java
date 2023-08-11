package com.assignements.recursion;

public class MinNonZeroProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 3;
		System.out.println(minNonZeroProduct(p));

	}
	    public static int minNonZeroProduct(int p) {
	       if(p==1) return 1;
	           int mod = 1000_000_007;

	        long n= (long)Math.pow(2,p)-1;
	        long res = ((n%mod) * pow((n-1), n/2) );
	        return (int)(res%mod);
	        
	    }
	    static long  pow(long number, long p){
	        if( p ==0)
	        return 1;
	        long N = (long)Math.pow(10, 9)+7;
	        if(p == 0) return 0;
	        long temp = pow(number, p/2);
	        temp = temp % N;

	        if(p % 2 == 0){
	            return (temp * temp)%N;
	        }
	        else{
	       return ((temp * temp)%N *(number % N)) % N;

	        }
	    }
	
}
