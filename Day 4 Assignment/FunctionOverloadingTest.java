/* write a program to overload method printlnfo() which will expect different parameter as int, double, float, boolean, string and call it in main
Expected output:- 
Integer value :--10
Double vale:-10.35
String value:- your name 
Char value:- J
Float value:-11.34
Boolean value:- true */

package com.techlab.assignment.test;

public class FunctionOverloadingTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a=10;
		double b=10.35;
		String s="Anupam Kumar Singh";
		char c='j';
		float d=11.34f;
		boolean flag=true;
		System.out.println("Integer Value :- "+printlnfo(a));
		System.out.println("Double Value :- "+printlnfo(b));
		System.out.println("String Value :- "+printlnfo(s));
		System.out.println("Char Value :- "+printlnfo(c));
		System.out.println("Float Value :- "+printlnfo(d));
		System.out.println("Boolean Value :- "+printlnfo(flag));
	}
	
	public static int printlnfo(int a)
	{
		return a;
	}
	public static double printlnfo(double a)
	{
		return a;
	}
	public static String printlnfo(String a)
	{
		return a;
	}
	public static char printlnfo(char a)
	{
		return a;
	}
	public static float printlnfo(float a)
	{
		return a;
	}
	public static boolean printlnfo(boolean a)
	{
		return a;
	}
}
