package com.techlab.tic.tac.toe;

public class CustomException {
	//private Board board;
	public void board(int size) throws InvalidBoardSizeException {
		if (!(size > 2 && size <= 6))
			throw new InvalidBoardSizeException("Enter board size between 2 to 6");
	}
	
	public void validate(int num) throws InvalidNumException {
		if (num <= 0 || num > 9)
			throw new InvalidNumException("Enter valid number");
	}

}
