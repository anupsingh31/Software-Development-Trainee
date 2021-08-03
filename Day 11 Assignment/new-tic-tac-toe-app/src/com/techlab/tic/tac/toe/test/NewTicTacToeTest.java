package com.techlab.tic.tac.toe.test;

import java.util.Scanner;

import com.techlab.tic.tac.toe.Board;
import com.techlab.tic.tac.toe.CustomExceptionHandling;
import com.techlab.tic.tac.toe.GameFacade;
import com.techlab.tic.tac.toe.Mark;
import com.techlab.tic.tac.toe.Result;

public class NewTicTacToeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomExceptionHandling cs = new CustomExceptionHandling();
		GameFacade facade;
		int size;
		while (true) {
			System.out.println("Enter the size of Board ");
			try {
				size = sc.nextInt();
				cs.board(size);
				facade = new GameFacade(size);
				break;

			} catch (Exception e) {
				sc.nextLine();
				System.out.println(e);

			}
		}

		System.out.println("Intial stage output");
		printBoard(size);

		while (facade.getStatus().equals(Result.INPROGRESS)) {
			if (facade.getPlayerListData().isEmpty()) {
				System.out.println("Enter the Player1 Name : ");
				facade.setPlayerData(sc.next(), Mark.X);
			} else if (facade.getPlayerListData().size() == 1 && facade.getnumFilledBoardData() % 2 != 0) {
				System.out.println("Enter the Player2 Name : ");
				facade.setPlayerData(sc.next(), Mark.O);
			}

			System.out.print("Enter Position : ");
			if (facade.getnumFilledBoardData() % 2 == 0) {
				System.out.println(facade.getPlayerName());
			} else {
				System.out.println(facade.getPlayerName());
			}

			int positionofBoard;
			try {
				positionofBoard = sc.nextInt();
				cs.validate(positionofBoard, size);
				facade.setPositionOfBoard(positionofBoard);
			} catch (Exception e) {
				System.err.println(e);
				sc.nextLine();
				continue;
			}

			boolean slotoccupied = facade.setnumFilledBoardData(facade.getnumFilledBoardData() + 1);

			if (slotoccupied)
				continue;

			printBoard(size);

		}

		desicion(facade.getStatus(), facade.getPlayerName());

		sc.close();

	}

	public static void printBoard(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.print(Board.board[i][j] + " ");

			System.out.println();
		}
	}

	public static void desicion(Result winner, String player) {
		if (winner.equals(Result.DRAW))
			System.out.println("It's a draw! Thanks for playing.");
		else
			System.out.println(player + "  " + Result.WIN);

	}

}
