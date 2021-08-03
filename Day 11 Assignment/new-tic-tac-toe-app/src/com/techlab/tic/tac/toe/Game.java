package com.techlab.tic.tac.toe;

import java.util.ArrayList;

public class Game {
	private Board board;
	private ResultAnalayzer analyze;
	private Mark turn;
	private ArrayList<Player> playerData;
	private int moves;
	private int positionofBoard;
	private Player player;

	public Game(ArrayList<Player> playerData, Board board, ResultAnalayzer analyze) {
		this.playerData = playerData;
		this.board = board;
		this.analyze = analyze;
	}

	public void Play(int count, int positionofBoard) {
		this.moves = count;
		this.positionofBoard = positionofBoard;

		try {
			if (moves % 2 != 0) {
				player = playerData.get(0);
				board.setGrid(player.getAssignMark(), positionofBoard);
				analyze.setMoves(moves);
				this.turn = player.getAssignMark();
				getStatus();
			} else {
				player = playerData.get(1);
				board.setGrid(player.getAssignMark(), positionofBoard);
				analyze.setMoves(moves);
				this.turn = player.getAssignMark();
				getStatus();
			}
		} catch (Exception e) {
			System.err.println(e);
			moves--;

		}

	}

	public Result getStatus() {
		if (analyze.getMoves() >= board.getSize() + 1) {
			return analyze.CheckWinner(turn, board.getRow(positionofBoard), board.getColumn(positionofBoard));
		}
		return Result.INPROGRESS;
	}

}
