package com.warmup.assignments.array1;

public class RotateImage {
	public static void main(String[] args) {
		//int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		rotate(matrix);
		
	}
	



public static void rotate(int[][] matrix) {
    for(int i=0;i<matrix.length;i++){
        for(int j=i+1;j<matrix.length;j++){
            int temp = matrix[i][j];
            matrix[i][j]= matrix[j][i];
            matrix[j][i]= temp;
        }
    }

    for (int i = 0; i < matrix.length; i++) {
        int low = 0, high = matrix.length - 1;
        while (low < high) {
            int t = matrix[i][low];
            matrix[i][low] = matrix[i][high];
            matrix[i][high] = t;
            low++;
            high--;
        }
    }
    

for(int i=0;i<matrix.length;i++){
    for(int j=0;j<matrix.length;j++){
    	System.out.print(matrix[i][j]+" ");
    }
	System.out.println();

}
    }

}
