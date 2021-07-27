package com.techlab.tic.tac.toe;

public class Board {
	//Mark turn = Mark.X;
	private int size;
	public static String[][] board = new String[3][3];

	public Board(int size) {

		this.size = size;
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

	public boolean setGrid(Mark turn,int positionofBoard) {
		int row = getRow(positionofBoard);
		int column = getColumn(positionofBoard);
		if (Board.board[row][column] == "-") {
			Board.board[row][column] = turn.toString();
			return true;
		} else {
			return false;
		}

	}

	public int getRow(int grid) {
		if (grid > 3 && grid <= 6)
			return 1;
		if (grid > 6 && grid <= 9)
			return 2;
		return 0;

	}

	public int getColumn(int grid) {
		if (grid % size == 1)
			return 0;
		if (grid % size == 2)
			return 1;
		return 2;
	}
}
