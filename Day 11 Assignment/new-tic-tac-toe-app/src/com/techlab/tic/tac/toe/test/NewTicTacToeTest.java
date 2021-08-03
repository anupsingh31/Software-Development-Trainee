package com.techlab.tic.tac.toe.test;

import java.util.ArrayList;
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

		ArrayList<Player> playerData = new ArrayList<Player>();
		Player player;
		Result status = Result.INPROGRESS;

		Game game = new Game(board, analyze);

		System.out.println("Intial stage output");

		printBoard(board.getSize());

		int count = 0;

		while (status.equals(Result.INPROGRESS)) {
			if (playerData.isEmpty()) {
				System.out.println("Enter the Player1 Name : ");
				playerData.add(new Player(sc.next(), Mark.X));
			} else if (playerData.size() == 1 && count % 2 != 0) {
				System.out.println("Enter the Player2 Name : ");
				playerData.add(new Player(sc.next(), Mark.O));
			}

			System.out.print("Enter Position : ");
			if (count % 2 == 0) {
				player = playerData.get(0);
				System.out.println(player.getPlayerName());
			} else {
				player = playerData.get(1);
				System.out.println(player.getPlayerName());
			}

			int positionofBoard;
			try {
				positionofBoard = sc.nextInt();
				cs.validate(positionofBoard, board.getSize());
			} catch (Exception e) {
				System.err.println(e);
				sc.nextLine();
				continue;
			}
			game.setPlayer(playerData);
			count++;
			game.Play(count, positionofBoard);

			if (count == analyze.getMoves() + 1) {
				count = analyze.getMoves();
				continue;
			}
			printBoard(board.getSize());
			status = game.getStatus();

		}
		if (count % 2 == 0) {
			player = playerData.get(1);
			desicion(status, count, player.getPlayerName());
		} else {
			player = playerData.get(0);
			desicion(status, count, player.getPlayerName());
		}
		sc.close();

	}

	public static void printBoard(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print(Board.board[i][j] + " ");

			System.out.println();
		}
	}

	public static void desicion(Result winner, int count, String player) {
		if (winner.equals(Result.DRAW))
			System.out.println("It's a draw! Thanks for playing.");
		else
			System.out.println(player + "  " + Result.WIN);

	}

}
