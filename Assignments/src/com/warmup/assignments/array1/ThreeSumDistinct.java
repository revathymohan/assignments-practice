package com.warmup.assignments.array1;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;



public class ThreeSumDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12, 3, 6, 1, 6, 9};
		List<List<Integer>> l = threeSum(nums,24);
		for(List<Integer> i : l) {
			for(Integer k : i) {
				System.out.println(k);
			}
		}
		

	}

	    public static List<List<Integer>> threeSum(int[] nums, int sum) {
	        int n = nums.length;
	        Arrays.sort(nums);
	        List<List<Integer>> list = new ArrayList<List<Integer>>();
	        Set<String> set = new HashSet<String>();
	        for(int i=0;i<n-2;i++){
	            int j = i+1;
	            int k=n-1;
	            while(j<k) {
	          
	                int sum1 = nums[i]+nums[j]+nums[k];
	                if(sum1 == sum){
	                    String str = ""+ nums[i]+""+nums[j]+""+nums[k];
	                    if(!set.contains(str)){
	                        list.add(Arrays.asList(nums[i], nums[j], nums[k]));
	                        set.add(str);

	                    }
	                set.add(str);
	                k--;
	                j++;
	                }else if(sum1> sum){
	                    k--;
	                } else {
	                    j++;
	                }
	            
	        }}
	return list;
	        
	    }
	

}
