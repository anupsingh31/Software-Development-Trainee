package com.techlab.facade.pattern.test;

import com.techlab.facade.pattern.ShapeMaker;

public class FacadePatternTest {

	public static void main(String[] args) {
		ShapeMaker shapemaker = new ShapeMaker();
		shapemaker.drawCircle();
		shapemaker.drawRectangle();
		shapemaker.drawSquare();

	}

}
