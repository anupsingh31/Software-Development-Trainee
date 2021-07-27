package com.techlab.decorater.pattern;

public abstract class ShapeDecorater {
	protected Shape shape;

	public ShapeDecorater(Shape shape) {
		this.shape = shape;
	}

	public void draw() {
		shape.draw();
	}
}
