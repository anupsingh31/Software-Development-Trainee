package com.techlab.imovable.test;

import com.techlab.imovable.Bike;
import com.techlab.imovable.Car;
import com.techlab.imovable.IMovable;

import com.techlab.imovable.Truck;

public class IMovableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMovable[] im=new IMovable[3];
		 im[0] = new Truck();
		
		im[1] = new Bike();
		
		im[2] = new Car();
		printInfo(im);

	}

	public static void printInfo(IMovable[] im){
		for(int i=0;i<im.length;i++)
		{
			im[i].Start();
			im[i].Stop();
		}
	}
}
