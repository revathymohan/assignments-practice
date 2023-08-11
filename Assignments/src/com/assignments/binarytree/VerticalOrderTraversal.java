package com.assignments.binarytree;
import java.util.*;
import java.util.Map.Entry;
class Pair{
	TreeNode root;
	int hd;
	Pair(TreeNode root , int distanse){
		this.hd= distanse;
		this.root= root;
		
	}
}
public class VerticalOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left= new TreeNode(2);
		root.right= new TreeNode(3);
		root.left.left= new TreeNode(4);
		root.left.right= new TreeNode(5);
		root.right.left= new TreeNode(6);
		root.right.right= new TreeNode(7);
		vertical(root);
		

	}

	private static List<List<Integer>> vertical(TreeNode root) {
		// TODO Auto-generated method stub
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		//Pair pair = new Pair(root,0);
		
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(root,0));
		while(!queue.isEmpty()){
			int size = queue.size();
			while(size>0) {
				Pair pair1 = queue.poll();
				if(map.containsKey(pair1.hd)) {
					map.get(pair1.hd).add(pair1.root.val);
				}else {
					List<Integer> list = new ArrayList<>();
					list.add(pair1.root.val);
					map.put(pair1.hd, list);
				}
				if(pair1.root.left!= null) {
					queue.add(new Pair(pair1.root.left, pair1.hd-1));
				}
				if(pair1.root.right!= null) {
					queue.add(new Pair(pair1.root.right, pair1.hd+1));
				}
				size--;
			}
			
			
		}
		//Map.Entry<Integer, List<Integer>> m = (Entry<Integer, List<Integer>>) map.entrySet();
		for(Map.Entry<Integer, List<Integer>> e : map.entrySet()){
            System.out.println("Key & val "+e.getKey()+ " "+e.getValue());
           
		}
		List<List<Integer>> list = new ArrayList<>();
        for(List i: map.values()){
					Collections.sort(i);
            list.add(i);
        }
        return list;
        
    }
		 
		
		
		
	

}
