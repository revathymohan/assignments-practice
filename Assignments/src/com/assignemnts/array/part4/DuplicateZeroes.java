package com.assignemnts.array.part4;

import java.util.Vector;

public class DuplicateZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,0,2,3,0,4};
		duplicateZeros(arr);

	}
	static void duplicateZeros(int[] arr) {
        int count = 0, n = arr.length;
        for(int i: arr)
            if(i == 0)
                ++count;
        for(int i = n - 1, j = n - 1 + count; i >= 0; --i, --j){
            if(arr[i] == 0) {
                if(j < n)
                    arr[j] = 0;
                --j;
            }
            if(j < n)
                arr[j] = arr[i];
        }
        for(int a: arr)
        	System.out.println(a);
    }

}
