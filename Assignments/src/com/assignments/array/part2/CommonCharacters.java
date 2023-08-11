package com.assignments.array.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonCharacters {
	static int MAX_CHAR = 26;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"bella","label","roller"};
		commonChars(str);


	}

public static List<String> commonChars(String[] words) {
        
        List<String> list=new ArrayList<>();
        char c[]=words[0].toCharArray();
        for(int i=0;i<c.length;i++){
            if(isContains(c[i],words))
                list.add(String.valueOf(c[i]));
        }
        return list;
        
    }
    
    public static boolean isContains(char c1,String[] words){
        for(int i=1;i<words.length;i++){
            if(!words[i].contains(String.valueOf(c1)))return false;
            else words[i]=words[i].replaceFirst(String.valueOf(c1), "@");
        }
        return true;
    }

}