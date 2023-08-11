package com.assignments.array.part3;
/*count no of Xs
 * count no of Os
 * 
 * check horizontal vertical diagonal for Xs
 * check horizontal vertical diagonal for Os
 * 
 * if x wins : no onf x must be greater than Os
 * if O wins  no of xs and no onf os are equal
 * else
 * return  no of xs atmost greater than no of os
 * 
 * 
 */
public class ValidTicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String[] board = {"XXX","   ","OOO"};
   System.out.println(validTicTacToe(board));
	}
	 public static boolean validTicTacToe(String[] board) {
		 int countX=0, countO=0;
		 boolean xWins = false, oWins = false;
		 for(int i=0;i<3;i++) {
			 for(char c: board[i].toCharArray()) {
				 if(c=='X') {
					 countX++;
				 }else if(c=='O') {
					 countO++;
				 }
			 	}
				 
				
			 
			 //check horizontal;
			 if(board[i] == "XXX") {
				 xWins = true;
			 }else if(board[i]=="OOO") {
				 oWins= true;
			 }
			 //check vertical
			 StringBuilder sb = new StringBuilder().append(board[0].charAt(i)).append(board[1].charAt(i))
					 .append(board[2].charAt(i));
			 if(sb.toString()=="XXX") xWins = true;
			 else if(sb.toString()=="OOO") oWins = true;
		 }
			 //diagonal
			 
			 StringBuilder sb1 = new StringBuilder().append(board[0].charAt(0)).
					 append(board[1].charAt(1)).append(board[2].charAt(2));
			 
			 if(sb1.toString()=="XXX") xWins = true;
			 else if(sb1.toString()=="OOO") oWins = true;
			 
			 //diagonal cross

//			 StringBuilder sb2 = new StringBuilder().append(board[0].charAt(2)).
//					 append(board[1].charAt(1)).append(board[2].charAt(1));
//			 
//			 if(sb2.toString()=="XXX") xWins = true;
//			 else if(sb2.toString()=="OOO") oWins = true;
			 
			 if(xWins) {
				 return xWins && (countX - countO == 1);
				 
			 }else if(oWins) {
				 return oWins && (countX - countO == 0);

			 }
			 
			 
		 
		 return countX>=countO && countX - countO<=1;
	        
}
}