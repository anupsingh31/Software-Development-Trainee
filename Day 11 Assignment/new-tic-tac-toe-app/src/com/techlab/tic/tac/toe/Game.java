package com.techlab.tic.tac.toe;

public class Game {
	private Board board;
	private ResultAnalayzer analyze;
	private Mark turn;
	private Player[] player;
	private int moves;
	private int positionofBoard;

	public Game(Player[] player, Board board, ResultAnalayzer analyze) {
		this.player = player;
		this.board = board;
		this.analyze = analyze;
	}

	public void Play(int count, int positionofBoard) {
		this.moves = count;
		this.positionofBoard = positionofBoard;

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
		if (analyze.getMoves() >= board.getSize() + 1) {
			return analyze.CheckWinner(turn, board.getRow(positionofBoard), board.getColumn(positionofBoard));
		}
		return Result.INPROGRESS;
	}


}
