package com.techlab.lsp.solution;

public class Rectangle implements IShapeable {
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return length * breadth;
	}

}
