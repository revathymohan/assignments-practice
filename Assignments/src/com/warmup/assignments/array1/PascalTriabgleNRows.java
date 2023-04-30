package com.warmup.assignments.array1;

import java.util.List;
import java.util.ArrayList;

public class PascalTriabgleNRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(4);

	}
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> prev = new ArrayList<Integer>();
        prev.add(1);
        list.add(prev);
        if(numRows == 1){
            return list;
        }
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(1);
        list.add(l1);
        
        if(numRows ==2){
            return list;
        }
        int rows = 2;
       while(rows< numRows){
         List<Integer> current = new ArrayList<>();
         current.add(1);
         List<Integer> l = list.get(rows-1);
           for(int i=1;i<=rows-1;i++){
               int sum = l.get(i-1)+l.get(i);
               current.add(sum);
              

           }
           current.add(1);
           list.add(current);
           rows++;

       }
      
  return list;
  }

 
    
}


