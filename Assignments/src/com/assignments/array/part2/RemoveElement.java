package com.assignments.array.part2;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,2,3};
		int val = 3;
		removeelement(nums, val);

	}
	public static int removeelement(int[] nums, int val) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[count]= nums[i]    ;
                count++;               
            }
        }
        return count;
        
    }

}
