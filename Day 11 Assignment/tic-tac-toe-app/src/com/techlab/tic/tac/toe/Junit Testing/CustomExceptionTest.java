package com.techlab.tic.tac.toe;

import org.junit.jupiter.api.Test;

class CustomExceptionTest {

	@Test
	void testBoard() throws InvalidBoardSizeException {

		CustomException cs = new CustomException();

		try {
			cs.board(7);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	void testSlot() throws RepeatedNumException {
		CustomException cs = new CustomException();

		try {
			cs.slot(false);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test
	void testValidate() throws InvalidNumException {
		CustomException cs = new CustomException();

		try {
			cs.validate(20);
			;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
