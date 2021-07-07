/* Write a program to passing some value 12,03,45,67,24 through command Line and you have to find the even and odd Number */

package com.techlab.assignment.test;

public class CommandLineArgumentEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(" Even Number is : ");
		for(String num : args)
		{
			if(Integer.parseInt(num)%2==0)
				System.out.print(num+" ");
		}
		System.out.println(" ");
		System.out.print("Odd Number is : ");
		for(String num : args)
		{
			if(Integer.parseInt(num)%2!=0)
				System.out.print(num+" ");
		}
	}

}
