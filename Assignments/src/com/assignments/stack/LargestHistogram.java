package com.assignments.stack;

import java.util.LinkedList;
import java.util.Stack;

public class LargestHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights= {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(heights));
		

	}
	public static int largestRectangleArea(int[] heights) {
		   Stack < Integer > stack = new Stack<>();
		   stack.push(-1);
		   int length = heights.length;
		   int maxArea = 0;
		   for (int i = 0; i < length; i++) {
		     while ((stack.peek() != -1) &&
		       (heights[stack.peek()] >= heights[i])) {
		       int currentHeight = heights[stack.pop()];
		       int currentWidth = i - stack.peek() - 1;
		       maxArea = Math.max(maxArea, currentHeight * currentWidth);
		     }
		     stack.push(i);
		   }
		   while (stack.peek() != -1) {
		     int currentHeight = heights[stack.pop()];
		     int currentWidth = length - stack.peek() - 1;
		     maxArea = Math.max(maxArea, currentHeight * currentWidth);
		   }
		   return maxArea;
		 }
}
