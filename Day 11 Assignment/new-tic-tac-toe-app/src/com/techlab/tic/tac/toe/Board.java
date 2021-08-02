package com.techlab.tic.tac.toe;

public class Board {
	private int size;
	public static String[][] board;

	public Board(int size) {
		this.size = size;
		board = new String[size][size];
		generateGrid();
	}

	public int getSize() {
		return size;
	}

	private void generateGrid() {

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				board[i][j] = "-";
			}
		}
	}

	public void setGrid(Mark turn, int positionofBoard) throws RepeatedNumException {
		int row = getRow(positionofBoard);
		int column = getColumn(positionofBoard);
		if (!(Board.board[row][column] == "-"))
			throw new RepeatedNumException("Slot already taken; re-enter slot number:");
		else
			Board.board[row][column] = turn.toString();

	}

	public int getRow(int grid) {
		if (grid % size == 0) {
			return (grid / size) - 1;
		}
		return grid / size;
	}

	public int getColumn(int grid) {
		if (grid % size == 0) {
			return size - 1;
		}
		return (grid % size) - 1;
	}

}
