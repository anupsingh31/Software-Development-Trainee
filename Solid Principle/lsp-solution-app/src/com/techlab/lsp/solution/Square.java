package com.techlab.lsp.solution;

public class Square implements IShapeable {
	private int side;

	public Square(int side) {

		this.side = side;
	}

	public int getSide() {
		return side;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
