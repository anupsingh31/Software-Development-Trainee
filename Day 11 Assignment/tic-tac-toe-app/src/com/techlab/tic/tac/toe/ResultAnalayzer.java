package com.techlab.tic.tac.toe;

public class ResultAnalayzer  {
	public static Mark turn;
	private static int MIN_VAL=0;
	private static int MAX_VAL=8;

	public static Result checkWinner()
	{
		for(int i=MIN_VAL;i<MAX_VAL;i++)
		{
			String check="";
			switch(i)
			{
			case 0:
				check=Board.board[0]+Board.board[1]+Board.board[2];
				break;
			case 1:
				check=Board.board[3]+Board.board[4]+Board.board[5];
				break;
			case 2:
				check=Board.board[6]+Board.board[7]+Board.board[8];
				break;
			case 3:
				check=Board.board[0]+Board.board[3]+Board.board[6];
				break;
			case 4:
				check=Board.board[1]+Board.board[4]+Board.board[7];
				break;
			case 5:
				check=Board.board[2]+Board.board[5]+Board.board[8];
				break;
			case 6:
				check=Board.board[0]+Board.board[4]+Board.board[8];
				break;
			case 7:
				check=Board.board[2]+Board.board[4]+Board.board[6];
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
		for (int a = MIN_VAL; a <= MAX_VAL; a++) {
            if (Board.board[a]=="-") {
                break;
            }
            else if (a == MAX_VAL) {
                return Result.DRAW;
            }
	}
	
	        return Result.NULL;
}
}