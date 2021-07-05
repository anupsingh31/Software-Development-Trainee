//swap two nos without using thrid variable ...do it using function

package com.techlab.assignment.test;

public class SwapNumberFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=35, b=78;
		swap(a,b);
	}
	public static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swaping Number of a and b is : "+a+" "+b);
	}
}
