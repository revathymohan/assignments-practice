package com.assignments.array.part2;
import java.util.*;
import java.util.Map.Entry;
class VoteRecord{
    String team;
    public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int[] getRanks() {
		return ranks;
	}

	public void setRanks(int[] ranks) {
		this.ranks = ranks;
	}

	int[] ranks;
    
    public VoteRecord(String team, int teamCount){
        this.team = team;
        this.ranks = new int[teamCount];
    }
}
public class RankTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] votes = {"ABC","ACB","ABC","ACB","ACB"};
		String s = rankTeams(votes);
		System.out.println(s);
		
	}
    public static String rankTeams(String[] votes) {
        if(votes == null || votes.length == 0){
            return null;
        }
        
        if(votes.length == 1){
            return votes[0];
        }

        // save to map
        Map<String, VoteRecord> map = new HashMap<String, VoteRecord>();
        for(String vote : votes){
            for(int i = 0; i < vote.length(); i++){
                String team = String.valueOf(vote.charAt(i));
                VoteRecord record = map.getOrDefault(team, new VoteRecord(team, vote.length()));
                record.ranks[i]++;
                map.put(team, record);
            }
        }
		
        // sort in list
        List<VoteRecord> list = new ArrayList<VoteRecord>(map.values());
        Collections.sort(list, new Comparator<VoteRecord>() {
			@Override
			public int compare(VoteRecord o1, VoteRecord o2) {
				int idx = 0;
                while(idx < o1.ranks.length && idx < o2.ranks.length){
                    if(o1.ranks[idx] == o2.ranks[idx]){
                        idx++;
                    }else{
                        return o2.ranks[idx] - o1.ranks[idx];
                    }
                }
                //If two or more teams are still tied after considering all positions, we rank them alphabetically based on their team letter.
                return o1.team.compareTo(o2.team);
			}
		});
		
        for(VoteRecord r : list) {
        	System.out.println(r.getTeam());
        	int[] ranks = r.getRanks();
        	for(int i: ranks) {
        		System.out.print(i+" ");
        	}
    		System.out.println();

        	
        }
        //build result
        StringBuilder res = new StringBuilder();
        for(VoteRecord record : list){
            res.append(record.team);
        }
        
        return res.toString();
    }
	
}
