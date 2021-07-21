package com.techlab.tic.tac.toe.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.techlab.tic.tac.toe.Board;
import com.techlab.tic.tac.toe.Mark;
import com.techlab.tic.tac.toe.Result;
import com.techlab.tic.tac.toe.ResultAnalayzer;

public class TicTacToeTest {

	public static void main(String[] args) {

		Board board = new Board(3);

		Scanner sc = new Scanner(System.in);

		ResultAnalayzer analyze = new ResultAnalayzer(board);

		Mark turn = Mark.X;

		Result winner = Result.INPROGRESS;

		System.out.println("Intial stage output");

		printBoard();

		int count = 0, Min_Val=0, Max_Val=9;

		while (winner.equals(Result.INPROGRESS)) {
			System.out.print("Enter the PlayerName : ");
			if (count % 2 == 0) {
				System.out.println("Player1");
				count++;
			} else {
				System.out.println("Player2");
				count++;
			}

			int positionofBoard;

			try {
				positionofBoard = sc.nextInt();
				if (!(positionofBoard > Min_Val && positionofBoard <= Max_Val)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}

			int row = board.getRow(positionofBoard);
			int column = board.getColumn(positionofBoard);

			if (Board.board[row][column] == "-") {
				Board.board[row][column] = turn.toString();
				analyze.Moves++;
				if (turn.equals(Mark.X)) {
					printBoard();
					if (analyze.Moves >= 5) {
						winner = analyze.CheckWinner(turn, row, column);
					}
					turn = Mark.O;
				} else {
					printBoard();
					if (analyze.Moves >= 5) {
						winner = analyze.CheckWinner(turn, row, column);
					}
					turn = Mark.X;

				}
			} else {
				System.out.println("Slot already taken; re-enter slot number:");
				count--;
			}
		}

		if (winner.equals(Result.DRAW))
			System.out.println("It's a draw! Thanks for playing.");
		else if (count % 2 == 0)
			System.out.println("Player2 " + Result.WIN);
		else
			System.out.println("Player1 " + Result.WIN);

		sc.close();

	}

	public static void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(Board.board[i][j] + " ");

			System.out.println();
		}
	}

}
