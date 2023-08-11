package com.assignments.binarysearch;

public class MountainPeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,1};
		int index = peakIndexInMountainArray(array);
		System.out.println(index);

	}
	 public static int peakIndexInMountainArray(int[] arr) {
	        int low=0;
	        int high = arr.length-1;
	        while(low<=high){
	            int mid = low+(high-low)/2;
	            if(mid>0 && arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
	                return mid;

	            }else if(arr[mid]< arr[mid+1]){
	                low = mid+1;
	            } else if(arr[mid-1]>arr[mid]){
	                high = mid-1;
	            }
	        }
	        return -1;
	        
	    
    
}
}


