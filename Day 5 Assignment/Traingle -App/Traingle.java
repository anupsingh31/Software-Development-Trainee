//model class of triangle 


package com.techlab.traingle;

public class Traingle {
	public double side1,side2,side3;
	public void perimeter()
	{
		System.out.println("Perimeter of Traingle is : "+(side1+side2+side3));
	}
	public void area()
	{
		double s=((double)(side1+side2+side3)/2);
		System.out.println("perimeter of traingle is : "+Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
	}

}
