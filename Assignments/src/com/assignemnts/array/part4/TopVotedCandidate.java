package com.assignemnts.array.part4;
import java.util.*;

class TopVotedCandidate {
	
	  int[] persons;
	  int[] times;
	  Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
	    public TopVotedCandidate(int[] persons, int[] times) {
	        this.persons = persons;
	        this.times = times;
	        
	    }
	    
	    public int q(int t) {
	        int count =0;
	        for(int i=0;i<times.length;i++){
	            while(times[i]<=t){
	                count++;
	            }
	        }
	        for(int j=0;j<count;j++){
	            if(map.containsKey(persons[j])){
	                map.put(persons[j], map.get(persons[j])+1);
	            }else{
	                map.put(persons[j], 1);
	            }
	        }
	List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>();
	        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>(){
	 public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
	                return o2.getValue()-o1.getValue();
	            }

	        });
	        int s = list.get(0).getValue();
	List<Integer> sub = new ArrayList<Integer>();
	        for(Map.Entry<Integer, Integer> e : map.entrySet()){
	            int val = e.getKey();
	            if(val == s){
	             sub.add(e.getValue());
	            }
	        }
	        int l = sub.size();
	        return sub.get(l-1);

	        
	    }
	    static void main(String... args) {
	    	int[] persons = {0, 1, 1, 0, 0, 1, 0};
	    	int[] times = {0, 5, 10, 15, 20, 25, 30};
	    	
	    	TopVotedCandidate obj = new TopVotedCandidate(persons, times);
	    	int result = obj.q(8);
	    	System.out.println(result);
	    	
	    }
	}

	/**
	 * Your TopVotedCandidate object will be instantiated and called as such:
	 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
	 * int param_1 = obj.q(t);
	 */
