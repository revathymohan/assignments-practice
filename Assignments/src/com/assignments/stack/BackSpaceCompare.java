package com.assignments.stack;
import java.util.*;

public class BackSpaceCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="xywrrmp";
		String t="xywrrmu#p";
		System.out.println(backspaceCompare(s, t));

	}
	public static boolean backspaceCompare(String s, String t) {
        Stack<Character>stack1 = new Stack<Character>();
        Stack<Character>stack2 = new Stack<Character>();
int count=0;
        while(count<s.length()){
            char c = s.charAt(count);
              if(c == '#'){
                  stack1.pop();
              }else{
                  stack1.push(c);
              }
            count++;

        }
        count=0;
        while(count<t.length()){
        	System.out.println(count);
            char c = t.charAt(count);
              if(c == '#'){
                  stack2.pop();
              }else{
                  stack2.push(c);
              }
            count++;

        }
  if(stack1.size() != stack2.size())
  return false;
  while(!stack1.isEmpty()){
      if(stack1.pop() != stack2.pop()){
          return false;

      }

  }
  return true;
        
    }
}
