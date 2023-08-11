package com.assignments.binarytree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Node{
	int val;
	Node left;
	Node right;
}
public class BinaryTreeDiameter {
	
	int diameter(Node root) {
		int diameter = 0;
		Map<Node , Integer> map = new HashMap<>();
		Stack<Node> stack = new Stack<>();
		if(root != null) stack.push(root);
		while(!stack.isEmpty()) {
			Node node = stack.peek();
			if(node.left != null  && !map.containsKey(node)) {
				stack.push(node.left);
			}
			
			else if(node.right != null  && !map.containsKey(node)) {
				stack.push(node.right);
			}
			else {

		        // Process the root, once left and right sub-tree have been processed
		        stack.pop();
		        int leftDepth = map.getOrDefault(node.left, 0);
		        int rightDepth = map.getOrDefault(node.right, 0);

		        // Put the max depth at a node in the map
		        map.put(node, 1 + Math.max(leftDepth, rightDepth));

		        // Update the max diameter found so far
		        diameter = Math.max(diameter, leftDepth + rightDepth);
		      }
			
		}
		return diameter;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
