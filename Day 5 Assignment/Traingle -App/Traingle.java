//model class of triangle 


package com.techlab.traingle;

public class Traingle {
	public double side1,side2,side3;
	public double Perimeter()
	{
		return (side1+side2+side3);
	}
	public double Area()
	{
		double s=((double)(side1+side2+side3)/2);
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}

}
