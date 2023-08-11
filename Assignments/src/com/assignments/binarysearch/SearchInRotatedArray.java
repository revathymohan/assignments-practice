package com.assignments.binarysearch;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0};
		SearchInRotatedArray obj = new SearchInRotatedArray();
		int index = obj.search(nums, 0);
		System.out.println(index);

	}
	public int search(int[] nums, int target) {
        int n = nums.length-1;
         int val =  search(nums , 0, n, target);  
         return val;      
    }

    int search(int[] nums, int low,int high, int target){
    	while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]<nums[high])//right array is sorted
            {
                if(target>nums[mid] && target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
            else //left array is sorted
            {
                if(target>=nums[low] && target<nums[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
        }
        return -1;
    }

}
