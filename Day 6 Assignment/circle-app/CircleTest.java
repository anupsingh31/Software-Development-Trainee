
package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle s = new Circle();
		System.out.println("intial value of radius and color is ");
		System.out.println(s.getradius());
		System.out.println(s.getcolor());
		s.setradius(3.5f);
		s.setcolor("black");
		System.out.println("Updated value of radius and color is ");
		System.out.println(s.getradius());
		System.out.println(s.getcolor());
		System.out.println("For out rated range and default value");
		s.setradius(25.0f);
		s.setcolor("grey");
		System.out.println(s.getradius());
		System.out.println(s.getcolor());
		s.setradius(6.0f);
		s.AreaCircle();
		System.out.println("perimeter of circle is : "+s.ParimeterCircle());
	}

}
