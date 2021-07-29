package com.techlab.tic.tac.toe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	void testBoard() {
		// Arrange
		int expectedSize = 3;

		// Act
		Board board = new Board(3);

		// Assert
		assertEquals(expectedSize, board.getSize());
	}

	@Test
	void testSetGrid() {
		// Arrange
		boolean expectedGrid = true;
		int expectedRow = 2;
		int expectedColumn = 0;

		// Act
		Board board = new Board(3);

		// Assert
		assertEquals(expectedGrid, board.setGrid(Mark.X, 7));
		assertEquals(expectedRow, board.getRow(7));
		assertEquals(expectedColumn, board.getColumn(7));
	}

}
