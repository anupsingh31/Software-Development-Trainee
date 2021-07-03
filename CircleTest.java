package com.techlab.demo;

import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for Area, 2 for Parameter");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("Enter the radius : ");
			int r = sc.nextInt();
			System.out.println(3.142 * r * r);
			break;
		case 2:
			System.out.println("Enter the radius : ");
			int r1 = sc.nextInt();
			System.out.println(2 * 3.142 * r1);
			break;
		default:
			System.out.println("Enter wrong choice");
		}

	}

}
