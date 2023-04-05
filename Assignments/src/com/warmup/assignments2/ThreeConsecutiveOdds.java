package com.warmup.assignments2;

public class ThreeConsecutiveOdds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,6,7,9,11,34};
		boolean isPresent = threeConsecutiveOdds(arr);
		System.out.println(isPresent);

	}
	    public static boolean threeConsecutiveOdds(int[] arr) {
	        int l = arr.length;
	        boolean isOdd = false;
	        for(int i=0;i<=l-3;i++){
	            int temp = arr[i];
	            if(temp %2 != 0 ){
	                if(arr[i+1] %2 != 0 && arr[i+2]%2 !=0){
	                    isOdd = true;
	                    break;

	                }
	            }
	        }
	        return isOdd;
	        
	    }
}
