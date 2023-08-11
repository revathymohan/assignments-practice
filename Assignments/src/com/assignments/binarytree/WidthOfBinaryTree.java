package com.assignments.binarytree;
import java.util.*;
public class WidthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node = new TreeNode(1);
		node.left= new TreeNode(3);
		node.right= new TreeNode(2);
		node.left.left= new TreeNode(5);
		node.left.right= new TreeNode(3);
		node.right.right= new TreeNode(9);
		System.out.println(widthOfBinaryTree(node));


	}
	public static int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.add(root);
	       int max= 0;
	        while(!queue.isEmpty()){
	        	int size = queue.size();
               max = Math.max(max, size);
	        	 while(size>0){

                   TreeNode curr = queue.poll();
                   if(curr != null){
                   queue.add(curr.left); 

		        	 queue.add(curr.right);
                   }
           size--;
                }
	        	
	        	
	        	
	        	
	        }
           return max;
       
   }

}
