// Write a program to calculate area and perimeter of circle


package com.techlab.demo;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of radius : ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		/* Normal calculation of area and perimeter of circle 
		System.out.println("Area of circle is "+3.142*r*r);
		System.out.println("Perimeter of circle is "+2*3.142*r); */
		System.out.println("Enter 1 for Area, 2 for Parameter");
		int a =sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("Enter the radius : ");
			System.out.println(3.142 * r * r);
			break;
		case 2:
			System.out.println("Enter the radius : ");
			System.out.println(2 * 3.142 * r);
			break;
		default:
			System.out.println("Enter wrong choice");
		}

	}

}
