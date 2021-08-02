package com.techlab.tic.tac.toe;

public class ResultAnalayzer {

	private int Moves;
	private Board board;

	public ResultAnalayzer(Board board) {
		this.board = board;
	}

	public int getMoves() {
		return Moves;
	}

	public void setMoves(int moves) {
		this.Moves = moves;
	}

	private String getChar(String board) {
		if (board == Mark.X.toString())
			return "X";
		else if (board == Mark.O.toString())
			return "O";
		else
			return " ";
	}

	public Result CheckWinner(Mark type, int row, int column) {
		if (checkRows(type, row))
			return Result.WIN;

		if (checkColumns(type, column))
			return Result.WIN;

		if (checkReverseDiagonal(type))
			return Result.WIN;

		if (checkDiagonal(type))
			return Result.WIN;

		if (Moves == (board.getSize() * board.getSize())) {
			return Result.DRAW;
		}

		return Result.INPROGRESS;
	}

	private boolean checkRows(Mark type, int row) {
		for (int j = 0; j < board.getSize(); j++) {
			if (!(getChar(Board.board[row][j]) == getChar(type.toString()))) {
				return false;
			}
		}
		return true;

	}

	private boolean checkColumns(Mark type, int column) {
		for (int j = 0; j < board.getSize(); j++) {
			if (!(getChar(Board.board[j][column]) == getChar(type.toString()))) {
				return false;
			}
		}
		return true;

	}

	private boolean checkDiagonal(Mark type) {
		int k = 0;
		while (k < board.getSize()) {
			if (!(getChar(Board.board[k][k]) == getChar(type.toString()))) {
				return false;
			}
			k++;
		}
		return true;

	}

	private boolean checkReverseDiagonal(Mark type) {
		int k = 0, j = board.getSize() - 1;
		while (k < board.getSize()) {
			if (!(getChar(Board.board[k][j]) == getChar(type.toString()))) {
				return false;
			}
			k++;
			j--;
		}
		return true;
	}

}
