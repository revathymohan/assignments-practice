package com.assignments.binarytree;
import java.util.*;

public class AverageOfLevels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null) return list;
        q.add(root);
        boolean flag = false;
        while(!q.isEmpty()){
            
            int size = q.size();
            int temp = size;
            double sum =0;
            while(size>0){
                TreeNode node = q.peek();
                q.poll();
                sum+=node.val;
              size--;
             
              if(node.left!= null)
                  q.add(node.left);
               if(node.right!= null)
                  q.add(node.right);

              }
              double avg = sum/temp;
            
            list.add(avg);
        }
        return list;
        
    }

}
