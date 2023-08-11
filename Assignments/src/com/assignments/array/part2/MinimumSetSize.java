package com.assignments.array.part2;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
 

public class MinimumSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {3,3,3,3,5,5,5,2,2,7};
		int a = minSetSize(array);
		System.out.println(a);
	}

	public static int minSetSize(int[] arr) {
		
		int l = arr.length;
		Map<Integer, Integer> count = new HashMap<Integer, Integer>();
		for (int i : arr) {
			if (count.containsKey(i)) {
				count.put(i, count.get(i) + 1);
			} else {
				count.put(i, 1);
			}

		}
		
        List<Map.Entry<Integer,Integer>> set=new ArrayList<>(count.entrySet());

		 Collections.sort(set, new Comparator<Map.Entry<Integer,Integer>>(){
	            public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2)
	            {
	                return e2.getValue() - e1.getValue();
	            }
	        });
		 int k=0,c=0;
	        for(Map.Entry<Integer,Integer> f:set)
	        {
	            if(k>=l/2)
	                return c;
	            k+=f.getValue();
	            c++;
	        }
	        return c;

		

	}
}
