package com.assignments.binarysearch;

public class Search2DMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},
				{18,21,23,26,30}};
		boolean status = searchMatrix(matrix, 5);
		System.out.println(status);

	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int m = matrix.length;
        int row=0,
        col= n-1;

        while(row<m && col>=0){
            if(matrix[row][col]== target)
            return true;
            if(matrix[row][col] < target ) row++;
            else
            col--;
        }
        return false;

}
}
