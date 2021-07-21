package com.techlab.tic.tac.toe.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.techlab.tic.tac.toe.Board;
import com.techlab.tic.tac.toe.Mark;
import com.techlab.tic.tac.toe.Result;
import com.techlab.tic.tac.toe.ResultAnalayzer;
public class TicTacToeTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ResultAnalayzer ra=new ResultAnalayzer();
		
		ra.turn = Mark.X;
		Result winner = Result.NULL;
     
        System.out.println("Intial stage output");
        printBoard();
        int count=0;
       
  
        while (winner.equals(Result.NULL)) {
        	System.out.print("Enter the PlayerName : ");
        	if(count%2==0)
        	{
        		System.out.println("Player1");
        		count++;
        	}
        	else
        	{
        		System.out.println("Player2");
        		count++;
        	}
            int numInput;
            try {
                numInput = sc.nextInt();
                if (!(numInput > ra.getMin_Val()  && numInput <= ra.getMax_Val()+1)) {
                    System.out.println(
                        "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input; re-enter slot number:");
                continue;
            }
            int row = 0, column=0;
            switch(numInput)
            {
            case 1:
            	row=0;
            	column=0;
            	break;
            case 2:
            	row=0;
            	column=1;
            	break;
            case 3:
            	row=0;
            	column=2;
            	break;
            case 4:
            	row=1;
            	column=0;
            	break;
            case 5:
            	row=1;
            	column=1;
            	break;
            case 6:
            	row=1;
            	column=2;
            	break;
            case 7:
            	row=2;
            	column=0;
            	break;
            case 8:
            	row=2;
            	column=1;
            	break;
            case 9:
            	row=2;
            	column=2;
            	break;
            }
            
            if (Board.board[row][column]=="-") {
                Board.board[row][column] = ra.turn.toString();
                ResultAnalayzer.Moves++;
                if (ra.turn.equals(Mark.X)) {
                	ra.turn = Mark.O;
                }
                else {
                	ra.turn = Mark.X;
                }
  
                printBoard();
                if(ResultAnalayzer.Moves>=5)
                {
                winner = ra.checkWinner(row,column);
                }
                //System.out.println(winner);
            }
            else {
                System.out.println(
                    "Slot already taken; re-enter slot number:");
                count--;
            }
        }
        if (winner.equals(Result.DRAW)) {
            System.out.println(
                "It's a draw! Thanks for playing.");
        }
        
       
        
	}
public static void printBoard() {
	for (int i=0; i<3; i++) {
		for (int j=0; j<3; j++)
			System.out.print((Board.board[i][j])+" ");

			System.out.println();
			}
	}

}