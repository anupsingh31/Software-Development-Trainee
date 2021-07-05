/* create new class name it as EvenOddFunctionTest.java ....in dat you have to create one method outside main() name is as printEvenOddNumber()....write your logic of calculating even and odd in dat and just call dat method inside main */


package com.techlab.assignment.test;

public class EvenOddFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25;
		boolean flag=evenodd(n);
		if(flag)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");

	}
	public static boolean evenodd(int a)
	{
		if(a%2==0)
			return true;
		else
			return false;
	}
}
