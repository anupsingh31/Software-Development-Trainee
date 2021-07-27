package com.techlab.decorater.pattern;

public class RedShapeDecorater extends ShapeDecorater {

	public RedShapeDecorater(Shape shape) {
		super(shape);

	}

	@Override
	public void draw() {

		shape.draw();
		setRedBorder(shape);
	}

	private void setRedBorder(Shape shape) {
		System.out.println("Border colour : Red");
	}
}
