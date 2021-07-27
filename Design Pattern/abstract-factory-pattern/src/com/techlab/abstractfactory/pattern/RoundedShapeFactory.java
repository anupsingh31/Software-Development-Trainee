package com.techlab.abstractfactory.pattern;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType type) {
		if (type == ShapeType.RECTANGLE)
			return new RoundedRectangle();

		return new RoundedSquare();

	}

}
