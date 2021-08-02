package com.techlab.tic.tac.toe;

public class Game {

	private Board board;
	private ResultAnalayzer analyze;
	private Mark turn;
	private Player[] player;
	private Result status;
	private int moves;
	private int positionofBoard;

	public Game(Player[] player, int positionofBoard, int count, Result status, Board board, ResultAnalayzer analyze) {
		this.player = player;
		this.positionofBoard = positionofBoard;
		this.moves = count;
		this.status = status;
		this.board = board;
		this.analyze = analyze;
		Play();
	}

	private void Play() {
		try {
			if (moves % 2 != 0) {
				board.setGrid(player[0].getAssignMark(), positionofBoard);
				analyze.setMoves(moves);
				this.turn = player[0].getAssignMark();
				getStatus();
			} else {
				board.setGrid(player[1].getAssignMark(), positionofBoard);
				analyze.setMoves(moves);
				this.turn = player[1].getAssignMark();
				getStatus();
			}
		} catch (Exception e) {
			System.err.println(e);
			moves--;
		}

	}

	public Result getStatus() {
		if (analyze.getMoves() >= 2 * board.getSize() + 1) {
			status = analyze.CheckWinner(turn, board.getRow(positionofBoard), board.getColumn(positionofBoard));
		}
		return status;
	}

}
