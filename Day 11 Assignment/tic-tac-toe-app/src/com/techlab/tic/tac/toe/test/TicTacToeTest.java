package com.techlab.tic.tac.toe.test;

import java.util.Scanner;

import com.techlab.tic.tac.toe.Board;
import com.techlab.tic.tac.toe.CustomException;
import com.techlab.tic.tac.toe.Mark;
import com.techlab.tic.tac.toe.Result;
import com.techlab.tic.tac.toe.ResultAnalayzer;

public class TicTacToeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomException cs = new CustomException();
		int size;
		while (true) {
			System.out.println("Enter the size of Board ");
			try {
				size = sc.nextInt();
				cs.board(size);
				break;

			} catch (Exception e) {
				System.out.println(e);

			}
		}

		Board board = new Board(size);

		ResultAnalayzer analyze = new ResultAnalayzer(board);

		Mark turn = Mark.X;

		Result winner = Result.INPROGRESS;

		System.out.println("Intial stage output");

		printBoard(board.getSize());
		int count = 0;
		String Player1 = "", Player2 = "";
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
			} else {
				System.out.println(Player2);
			}
			int positionofBoard;
			try {
				positionofBoard = sc.nextInt();
				count++;
				cs.validate(positionofBoard);
			} catch (Exception e) {
				System.err.println(e);
				count--;
				continue;
			}

			boolean mark = board.setGrid(turn, positionofBoard);

			try {
				cs.slot(mark);
				analyze.setMoves(count);
				printBoard(board.getSize());
				winner = checkwinner(analyze, winner, board, turn, positionofBoard);
				turn = mark(turn);

			} catch (Exception ec) {
				System.err.println(ec);
				count--;
				continue;
			}
		}

		Desicion(winner, count, Player1, Player2);
		sc.close();

	}

	public static void printBoard(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print(Board.board[i][j] + " ");

			System.out.println();
		}
	}

	public static void Desicion(Result winner, int count, String Player1, String Player2) {
		if (winner.equals(Result.DRAW))
			System.out.println("It's a draw! Thanks for playing.");
		else if (count % 2 == 0)
			System.out.println(Player2 + "  " + Result.WIN);
		else
			System.out.println(Player1 + "  " + Result.WIN);
	}

	public static Result checkwinner(ResultAnalayzer analyze, Result winner, Board board, Mark turn,
			int positionofBoard) {
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
