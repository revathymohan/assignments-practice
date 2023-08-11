package com.assignemnts.array.part4;

import java.util.List;
import java.util.ArrayList;


public class KidaWithCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidaWithCandies obj = new KidaWithCandies();
		int[] candies = {2,3,5,1,3};
		obj.kidsWithCandies(candies, 3).stream().forEach(System.out::println);

	}
	    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) { 
	        List<Boolean> list = new ArrayList<>(candies.length);
	        int max = Integer.MIN_VALUE;
	        for(int i: candies){
	         max = Math.max(i, max);
	        }
	for(int i: candies){
	    int a = i+ extraCandies;
	    if(a>=max){
	        list.add(true);
	    }   else{
	        list.add(false);
	         }
	    }
	return list;
	        
	    }
	
}
