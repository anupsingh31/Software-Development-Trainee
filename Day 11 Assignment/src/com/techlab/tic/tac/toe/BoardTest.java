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

		int expectedRow = 2;
		int expectedColumn = 0;

		int expectedRow1 = 1;
		int expectedColumn1 = 1;

		int expectedRow2 = 0;
		int expectedColumn2 = 2;

		int expectedRow3 = 0;
		int expectedColumn3 = 0;

		// Act
		Board board = new Board(3);

		// Assert

		assertEquals(expectedRow, board.getRow(7));
		assertEquals(expectedColumn, board.getColumn(7));

		assertEquals(expectedRow1, board.getRow(5));
		assertEquals(expectedColumn1, board.getColumn(5));

		assertEquals(expectedRow2, board.getRow(3));
		assertEquals(expectedColumn2, board.getColumn(3));

		assertEquals(expectedRow3, board.getRow(1));
		assertEquals(expectedColumn3, board.getColumn(1));
	}

}
