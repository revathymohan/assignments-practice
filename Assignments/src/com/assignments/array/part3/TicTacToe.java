package com.assignments.array.part3;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] board = {"XXX","   ","OOO"};
		   System.out.println(validTicTacToe(board));

	}
	public static boolean validTicTacToe(String[] board) {
        //count no of x
        //count no of Os
                //check horizontal, vertical diagonal

        //xountX > count y  x wins
        //if countx == conut y y wins;

        //
        
        int countx=0,counto=0;
        boolean xwins=false, owins=false;
        for(int i=0;i<3;i++){
            String s = board[i];
            for( char c: s.toCharArray()){
                if(c == 'X'){
                countx++;
                }else if(c == 'O'){
                    counto++;
                }
            }
            if(board[i]== "XXX"){
                xwins = true;
            }
            
           else if(board[i]== "OOO"){
                owins = true;
            }

 StringBuilder sb = new StringBuilder().append(board[0].charAt(i)).append(board[1].charAt(i)).append(board[2].charAt(i));

         //vertical check 

        String vertical = sb.toString();
        if(vertical == "XXX"){
            xwins = true;
        } else if(vertical == "OOO"){
            owins = true;
        }


 }
//diagonal
 StringBuilder sb1 = new StringBuilder().append(board[0].charAt(0)).append(board[1].charAt(1)).append(board[2].charAt(2));
 String diagonal = sb1.toString();
 if(diagonal == "XXX"){
            xwins = true;
        } 
       else if(diagonal == "OOO"){
            owins = true;
    }
    if(xwins) {
	return xwins && (countx - counto == 1);
				 
			 }else if(owins) {
				 return owins && (countx - counto == 0);

			 }
			 
			 
		 
		 return countx>=counto && countx - counto<=1;
        
    }

}
