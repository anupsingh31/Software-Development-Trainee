package com.techlab.imovable.test;

import com.techlab.imovable.Bike;
import com.techlab.imovable.Car;
import com.techlab.imovable.IMovable;

import com.techlab.imovable.Truck;

public class IMovableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMovable i = new Truck();
		printInfo(i);
		IMovable i1 = new Bike();
		printInfo(i1);
		IMovable i2 = new Car();
		printInfo(i2);

	}

	public static void printInfo(IMovable i) {
		i.Start();
		i.Stop();
	}
}
