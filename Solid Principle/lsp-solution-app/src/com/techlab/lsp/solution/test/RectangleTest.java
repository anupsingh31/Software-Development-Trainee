package com.techlab.lsp.solution.test;

import com.techlab.lsp.solution.IShapeable;
import com.techlab.lsp.solution.Rectangle;
import com.techlab.lsp.solution.Square;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle(15, 11);
		Square s = new Square(20);
		printInfo(r);
		printInfo(s);

	}

	public static void printInfo(IShapeable s) {
		System.out.println("Area :  " + s.calculateArea());
	}
}
