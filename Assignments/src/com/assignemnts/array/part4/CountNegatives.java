package com.assignemnts.array.part4;

public class CountNegatives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
		countNegatives(grid);
	}
	 public static int countNegatives(int[][] grid) {
	        int count =0;
	        for(int[] row : grid){
	          count+= countRowwise(row);
	        }
	        System.out.println("Count -- "+count);
	        return count;
	    }

	    public static int countRowwise(int[] row){
	        int low =0;int high = row.length-1;
	        while(low<=high){ 
	            int mid = low+ (high-low)/2;
	            if(row[mid]>=0){
	                low= mid+1;
	                
	            }else{
	                high = mid-1;
	            }
	        }
	        return row.length-high-1;
	    }
}
