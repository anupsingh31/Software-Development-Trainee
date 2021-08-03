package com.techlab.tic.tac.toe;

public class CustomExceptionHandling {
	
	public void board(int size) throws InvalidBoardSizeException {
		if (!(size > 2 && size <= 6))
			throw new InvalidBoardSizeException("Enter board size between 3 to 6");
	}
	
	public void validate(int num, int boardSize) throws InvalidNumException {
		if (num <= 0 || num > boardSize*boardSize)
			throw new InvalidNumException("Enter valid number");
	}

}
