//Program to find Armstrong number


package com.techlab.demo;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter the Number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int copy = n, temp = 0;
		while (n != 0) {
			int a = n % 10;
			temp += a * a * a;
			n = n / 10;

		}
		if (copy == temp) {
			System.out.println("It is Armstrong Number : "+copy);
		}
		else
			System.out.println("It is not a Armstrong Number : "+copy);
	}

}
