package com.assignments.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class NodeConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left= new TreeNode(2);
		root.right= new TreeNode(3);
		root.left.left= new TreeNode(4);
		root.left.right= new TreeNode(5);
		root.right.left= new TreeNode(6);
		root.right.right= new TreeNode(7);
		TreeNode node = connect(root);
		display(node);

	}
	static void display(TreeNode n) {
		if(n== null) return;
		System.out.println(n.val+" ->"+ n.next == null? null: n.next.val);
		display(n.left);
		display(n.right);

		
	}

	private static TreeNode connect(TreeNode root) {
		// TODO Auto-generated method stub
        if(root==null) return root;

		
		TreeNode temp = root;
	        Queue<TreeNode> queue = new LinkedList<TreeNode>();
	        queue.add(root);
	        queue.add(null);
	        while(!queue.isEmpty()){
	        	
	        	TreeNode curr = queue.poll();
	        	if(curr == null && queue.isEmpty())
	        		return root;
	        	if(curr == null) queue.add(null);
	        	else {
	        		curr.next= queue.peek();
		        	if(curr.left != null) queue.add(curr.left);
		        	if(curr.right != null) queue.add(curr.right);

	        	}
	        	
	        	
	        	
	        }
			return root;
	           
	        
	    }
		
	

}
