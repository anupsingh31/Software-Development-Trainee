package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleArrayObjectTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Circle[] c = new Circle[4];
		Circle c1 = new Circle();
		c1.setRadius(8.4f);
		c1.setColor("green");
		c[0] = c1;
		Circle c2 = new Circle();
		c2.setRadius(6.7f);
		c2.setColor("black");
		c[1] = c2;
		Circle c3 = new Circle();
		c3.setRadius(9.8f);
		c3.setColor("orange");
		c[2] = c3;
		Circle c4 = new Circle();
		c4.setRadius(4.3f);
		c4.setColor("pink");
		c[3] = c4;
		printCircleInfo(c);
		findSmallestCircle(c);
		findLargestCircle(c);
	}

	public static void printCircleInfo(Circle[] arrobj) {
		for (int i = 0; i < arrobj.length; i++) {
			System.out.println("radius of " + (i + 1) + " object is : " + arrobj[i].getRadius());
			System.out.println("color of " + (i + 1) + " object is : " + arrobj[i].getColor());
		}
	}

	public static void findSmallestCircle(Circle[] small) {
		float temp = small[0].getRadius();
		for (int i = 1; i < small.length; i++) {
			if (temp > small[i].getRadius())
				temp = small[i].getRadius();
		}
		System.out.println("smallest radius of circle of array object is : " + temp);
	}

	public static void findLargestCircle(Circle[] large) {

		float temp = large[0].getRadius();
		for (int i = 1; i < large.length; i++) {
			if (temp < large[i].getRadius())
				temp = large[i].getRadius();
		}
		System.out.println("largest radius of circle of array object is : " + temp);

	}
}
