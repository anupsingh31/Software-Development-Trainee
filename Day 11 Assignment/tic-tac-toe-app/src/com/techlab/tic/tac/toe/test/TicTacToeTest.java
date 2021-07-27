package com.techlab.tic.tac.toe.test;

import java.util.Scanner;

import com.techlab.tic.tac.toe.Board;
import com.techlab.tic.tac.toe.CustomException;
import com.techlab.tic.tac.toe.Mark;
import com.techlab.tic.tac.toe.Result;
import com.techlab.tic.tac.toe.ResultAnalayzer;

public class TicTacToeTest {
	static int count = 0, Min_Val = 0, Max_Val = 9;
	static String Player1 = "", Player2 = "";
	static int positionofBoard;

	public static void main(String[] args) {

		Board board = new Board(3);

		Scanner sc = new Scanner(System.in);

		ResultAnalayzer analyze = new ResultAnalayzer(board);

		Mark turn = Mark.X;

		Result winner = Result.INPROGRESS;

		CustomException cs = new CustomException();

		System.out.println("Intial stage output");

		printBoard();

		while (winner.equals(Result.INPROGRESS)) {
			if (Player1.isEmpty()) {
				System.out.println("Enter the Player1 Name : ");
				Player1 = sc.next();
			} else if (Player2.isEmpty()) {
				System.out.println("Enter the Player2 Name : ");
				Player2 = sc.next();
			}
			System.out.print("Enter Position : ");
			if (count % 2 == 0) {
				System.out.println(Player1);
				count++;
			} else {
				System.out.println(Player2);
				count++;
			}
			try {
				positionofBoard = sc.nextInt();
				cs.validate(positionofBoard);
			} catch (Exception e) {
				System.err.println(e);
				continue;
			}

			boolean mark = board.setGrid(turn, positionofBoard);

			if (mark) {
				analyze.setMoves(count);
				printBoard();
				winner = checkwinner(analyze, winner, board, turn);
				turn = mark(turn);

			} else {
				System.out.println("Slot already taken; re-enter slot number:");
				count--;
			}
		}

		Desicion(winner);
		sc.close();

	}

	public static void printBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(Board.board[i][j] + " ");

			System.out.println();
		}
	}

	public static void Desicion(Result winner) {
		if (winner.equals(Result.DRAW))
			System.out.println("It's a draw! Thanks for playing.");
		else if (count % 2 == 0)
			System.out.println(Player2 + "  " + Result.WIN);
		else
			System.out.println(Player1 + "  " + Result.WIN);
	}

	public static Result checkwinner(ResultAnalayzer analyze, Result winner, Board board, Mark turn) {
		if (analyze.getMoves() >= 5) {
			winner = analyze.CheckWinner(turn, board.getRow(positionofBoard), board.getColumn(positionofBoard));
		}
		return winner;
	}

	public static Mark mark(Mark turn) {
		if (turn.equals(Mark.X)) {
			return Mark.O;
		}
		return Mark.X;
	}

}
