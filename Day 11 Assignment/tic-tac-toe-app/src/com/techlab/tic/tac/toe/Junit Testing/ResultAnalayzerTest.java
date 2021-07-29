package com.techlab.tic.tac.toe;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResultAnalayzerTest {

	@Test
	void testResultAnalayzer() {
		// Arrange
		int expectedsize = 3;
		int expectedRow = 2;
		int expectedColumn = 0;

		// Act
		Board board;
		new ResultAnalayzer(new Board(3));
		board = new Board(3);

		// Assert
		assertEquals(expectedsize, board.getSize());
		assertEquals(expectedRow, board.getRow(7));
		assertEquals(expectedColumn, board.getColumn(7));

	}

	@Test
	void testCheckWinner() {
		// Arrange
		Result expected = Result.INPROGRESS;

		// Act
		ResultAnalayzer analyze = new ResultAnalayzer(new Board(3));

		// Assert
		assertEquals(expected, analyze.CheckWinner(Mark.X, 0, 2));
	}

}
