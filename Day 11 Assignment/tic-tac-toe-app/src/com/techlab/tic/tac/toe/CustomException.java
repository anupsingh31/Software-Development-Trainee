package com.techlab.tic.tac.toe;

public class CustomException {

	public void board(int size) throws InvalidBoardSizeException, InvalidNumException {
		if (size < 2 || size > 6)
			throw new InvalidNumException("Enter board size between 2 to 6");
	}

	public void slot(boolean mark) throws repeatedNumException {
		if (!(mark))
			throw new repeatedNumException("Slot already taken; re-enter slot number:");
	}

	public void validate(int num) throws InvalidNumException {
		if (num <= 0 || num > 16)
			throw new InvalidNumException("Enter valid number");
	}

}
