package com.techlab.tic.tac.toe;
import java.util.*;
public class ResultAnalayzer  {
	public Mark turn;
	private static int MIN_VAL=0;
	private static int MAX_VAL=8;
	public static int Moves=0;
	private int row,column;
	
	public int getMin_Val() {
		return MIN_VAL;
	}
	
	public int getMax_Val()
	{
		return MAX_VAL;
	}
	
	public static String getChar(String board) {
		if (board == Mark.X.toString())
			return "X"; 
			else if (board == Mark.O.toString())
			return "O"; 
			else
			return " ";
	}
	public Result checkWinner(int row, int column)
	{
		for(int i=MIN_VAL;i<MAX_VAL;i++)
		{
			String check="";
			switch(i)
			{
			case 0:
				check=getChar(Board.board[0][0])+getChar(Board.board[0][1])+getChar(Board.board[0][2]);
				break;
			case 1:
				check=getChar(Board.board[1][0])+getChar(Board.board[1][1])+getChar(Board.board[1][2]);
				break;
			case 2:
				check=getChar(Board.board[2][0])+getChar(Board.board[2][1])+getChar(Board.board[2][2]);
				break;
			case 3:
				check=getChar(Board.board[0][0])+getChar(Board.board[1][1])+getChar(Board.board[2][2]);
				break;
			case 4:
				check=getChar(Board.board[0][2])+getChar(Board.board[1][1])+getChar(Board.board[2][0]);
				break;
			case 5:
				check=getChar(Board.board[0][0])+getChar(Board.board[1][0])+getChar(Board.board[2][0]);
				break;
			case 6:
				check=getChar(Board.board[0][1])+getChar(Board.board[1][1])+getChar(Board.board[2][1]);
				break;
			case 7:
				check=getChar(Board.board[0][2])+getChar(Board.board[1][2])+getChar(Board.board[2][2]);
				break;
			}
			//System.out.println(check);
			if(check.equalsIgnoreCase("XXX"))
			{System.out.println("Player1 Winner");
				return Result.WIN;
			}
			else if (check.equalsIgnoreCase("OOO")) {
				System.out.println("Player2 Winner");
			
                return Result.WIN;
			}
		}
		
		for(row=0;row<3;row++)
		{
			for(column=0;column<3;column++)
			{
				if(Board.board[row][column]=="-")
					return Result.NULL;
			}
		}
             if ((row*column)-1 == MAX_VAL) {
                return Result.DRAW;
            }
	
	System.out.println(Moves);
	        return Result.NULL;
}
}