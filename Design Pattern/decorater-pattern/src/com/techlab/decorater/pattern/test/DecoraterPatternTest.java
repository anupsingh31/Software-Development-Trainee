package com.techlab.decorater.pattern.test;

import com.techlab.decorater.pattern.Circle;
import com.techlab.decorater.pattern.Rectangle;
import com.techlab.decorater.pattern.RedShapeDecorater;
import com.techlab.decorater.pattern.Shape;
import com.techlab.decorater.pattern.ShapeDecorater;

public class DecoraterPatternTest {

	public static void main(String[] args) {

		Shape circle = new Circle();
		ShapeDecorater redcircle = new RedShapeDecorater(new Circle());
		ShapeDecorater redRectangle = new RedShapeDecorater(new Rectangle());

		System.out.println("Circle with Normal Border ");
		circle.draw();

		System.out.println("\nCircle with Red Border ");
		redcircle.draw();

		System.out.println("\nRectangle with Red Border ");
		redRectangle.draw();
	}

}
