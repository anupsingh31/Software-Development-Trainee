package com.techlab.abstractfactory.pattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType type) {
		if (type == ShapeType.RECTANGLE)
			return new Rectangle();

		return new Square();
	}

}
