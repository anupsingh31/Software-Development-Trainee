package com.techlab.tic.tac.toe.test;

import java.util.Scanner;

import com.techlab.tic.tac.toe.Board;
import com.techlab.tic.tac.toe.CustomExceptionHandling;
import com.techlab.tic.tac.toe.Game;
import com.techlab.tic.tac.toe.Mark;
import com.techlab.tic.tac.toe.Player;
import com.techlab.tic.tac.toe.Result;
import com.techlab.tic.tac.toe.ResultAnalayzer;

public class NewTicTacToeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomExceptionHandling cs = new CustomExceptionHandling();
		int size;
		while (true) {
			System.out.println("Enter the size of Board ");
			try {
				size = sc.nextInt();
				cs.board(size);
				break;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println(e);

			}
		}

		Board board = new Board(size);

		ResultAnalayzer analyze = new ResultAnalayzer(board);
		Player[] player = new Player[2];

		player[0] = new Player(null, Mark.X);

		player[1] = new Player(null, Mark.O);

		Result status = Result.INPROGRESS;

		Game game = new Game(player, board, analyze);

		System.out.println("Intial stage output");

		printBoard(board.getSize());
		int count = 0;

		while (status.equals(Result.INPROGRESS)) {
			if (player[0].getPlayerName() == null) {
				System.out.println("Enter the Player1 Name : ");
				player[0].setPlayerName(sc.next());
			} else if (player[1].getPlayerName() == null && count % 2 != 0) {
				System.out.println("Enter the Player2 Name : ");
				player[1].setPlayerName(sc.next());
			}

			System.out.print("Enter Position : ");
			if (count % 2 == 0) {
				System.out.println(player[0].getPlayerName());
			} else {
				System.out.println(player[1].getPlayerName());
			}

			int positionofBoard;
			try {
				positionofBoard = sc.nextInt();
				cs.validate(positionofBoard);
			} catch (Exception e) {
				System.err.println(e);
				continue;
			}

			count++;
			game.Play(count, positionofBoard);

			if (count == analyze.getMoves() + 1) {
				count = analyze.getMoves();
				continue;
			}
			printBoard(board.getSize());
			status = game.getStatus();

		}
		desicion(status, count, player[0].getPlayerName(), player[1].getPlayerName());
		sc.close();

	}

	public static void printBoard(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print(Board.board[i][j] + " ");

			System.out.println();
		}
	}

	public static void desicion(Result winner, int count, String Player1, String Player2) {
		if (winner.equals(Result.DRAW))
			System.out.println("It's a draw! Thanks for playing.");
		else if (count % 2 == 0)
			System.out.println(Player2 + "  " + Result.WIN);
		else
			System.out.println(Player1 + "  " + Result.WIN);

	}

}
