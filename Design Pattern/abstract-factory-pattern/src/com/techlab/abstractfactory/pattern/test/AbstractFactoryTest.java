package com.techlab.abstractfactory.pattern.test;

import com.techlab.abstractfactory.pattern.AbstractFactory;
import com.techlab.abstractfactory.pattern.FactoryProducer;
import com.techlab.abstractfactory.pattern.Shape;
import com.techlab.abstractfactory.pattern.ShapeType;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		Shape shape1 = shapeFactory.getShape(ShapeType.RECTANGLE);
		shape1.draw();
		Shape shape2 = shapeFactory.getShape(ShapeType.SQUARE);
		shape2.draw();

		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		Shape shape3 = shapeFactory1.getShape(ShapeType.RECTANGLE);
		shape3.draw();
		Shape shape4 = shapeFactory1.getShape(ShapeType.SQUARE);
		shape4.draw();

	}

}
