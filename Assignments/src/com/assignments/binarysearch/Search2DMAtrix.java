package com.assignments.binarysearch;

public class Search2DMAtrix {
	public static boolean searchMatrix(int[][] matrix, int target) {
        //int n= matrix[0].length;
        int n = matrix.length;
        int row = matrix[0].length;
       for(int i=0;i<n;i++){
           int low=0;
           int high = row-1;
           if(target>= matrix[i][0] && target<= matrix[i][row-1]){
               while(low<=high){
              int mid =  low +(high-low)/2;
              if(target == matrix[i][mid]){
                  return true;
              }
              if(target<matrix[i][mid]){
                  high = mid-1;
              }else {
                  low= mid+1;
              }
           }
               return false;
           }
           
           
       }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int[][] matrix = {{1,3}};

		boolean status = searchMatrix(matrix, 3);
		System.out.println(status);

	}

}
