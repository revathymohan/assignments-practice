package com.assignments.array.part2;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,3,3,4,3,2,4,2};

	}
	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i: nums){
            // if(set.contains(i))
            // return true;
            // else{
            //     set.add(i);
            // }
            if(!set.add(i)){
                return true;
            }
        }
        return false;
        
    }
}
