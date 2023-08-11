package com.assignments.binarytree;
import java.util.*;
 class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
		public TreeNode next;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	         
	      }
	  }
public class ZigZagLevelOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,2,4,1,null,3,-1,5,1,null,6,null,8
		TreeNode root = new TreeNode(0);
		root.left= new TreeNode(2);
		root.right= new TreeNode(4);
		root.left.left= new TreeNode(1);
		root.left.right= null;
		root.right.left= new TreeNode(3);
		root.right.right= new TreeNode(-1);
		root.right.right.right= new TreeNode(8);

		root.left.left.left= new TreeNode(5);
		root.left.left.right= new TreeNode(1);
		root.right.left.right= new TreeNode(6);
		List<List<Integer>> l = zigzagLevelOrder(root);
		for(List i: l) {
			for(int j=0;j<i.size();j++) {
				System.out.print(i.get(j)+" ");
			}
			System.out.println();
		}

	}
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null) return list;
        q.add(root);
        boolean flag = false;
        while(!q.isEmpty()){
            
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            while(size>0){
                TreeNode node = q.peek();
                q.poll();
              l.add(node.val);
              size--;
             
              if(node.left!= null)
                  q.add(node.left);
               if(node.right!= null)
                  q.add(node.right);

                  
              }
            if(flag) Collections.reverse(l);
              flag = !flag;
              
            list.add(l);
        }
        return list;
    }

}
