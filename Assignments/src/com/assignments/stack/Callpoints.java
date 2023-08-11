package com.assignments.stack;
import java.util.*;

public class Callpoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] operations= {"5","2","C","D","+"};
		int sum = calPoints(operations);
		System.out.println(sum);

	}
	 public static int calPoints(String[] operations) {
	        Stack<Integer> stack = new Stack<Integer>();
	        
	        for(String c: operations){
	            if(Character.isDigit(c.charAt(0))){
	                stack.push(Integer.parseInt(c));
	            }else if(c== "C"){
	                stack.pop();
	            }else if(c=="D"){
	                stack.push(stack.peek()*2);
	            }else if(c=="+"){
	                int count=0;
	                int sum=0;
	                int[] arr= new int[2];
	                while(!stack.isEmpty() && count<2 ){
	                    int val = stack.pop();
	                    arr[count++]= val;
	                    sum+=val;

	                }

	                if(arr.length !=0){
	                stack.push(arr[1]);
	                stack.push(arr[0]);
	                }
	                stack.push(sum);
	            }
	            
	        }
	        int tot=0;
	        while(!stack.isEmpty()){
	tot+=stack.pop();
	        }
	        return tot;
	    }
}
