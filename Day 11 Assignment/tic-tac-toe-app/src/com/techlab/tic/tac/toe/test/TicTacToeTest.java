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
		int MIN_VAL=0;
		int MAX_VAL=9;
		Scanner sc=new Scanner(System.in);
		Board.board = new String[9];
		ResultAnalayzer.turn = Mark.X;
		Result winner = Result.NULL;
        for (int a = MIN_VAL; a < MAX_VAL; a++) {
            Board.board[a]= "-" ;
        }
        System.out.println("Intial stage output");
        Board.printBoard();
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
                if (!(numInput > MIN_VAL && numInput <= MAX_VAL)) {
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
            if (Board.board[numInput - 1]==("-")) {
                Board.board[numInput - 1] = ResultAnalayzer.turn.toString();
  
                if (ResultAnalayzer.turn.equals(Mark.X)) {
                	ResultAnalayzer.turn = Mark.O;
                }
                else {
                	ResultAnalayzer.turn = Mark.X;
                }
  
                Board.printBoard();
                winner = ResultAnalayzer.checkWinner();
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

}
