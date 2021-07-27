package com.techlab.tic.tac.toe;

public class CustomException {
	public void validate(int num) throws InvalidNumException {
		if (num <= 0 || num > 9)
			throw new InvalidNumException("Enter valid number");
	}

}
