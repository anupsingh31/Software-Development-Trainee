package com.techlab.tic.tac.toe;

public class Board {
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
				System.out.println("*");
				board[i][j] = "-";
				System.out.println(board[i][j]);
			}
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
