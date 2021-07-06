//Write a program to calculate power of a number 

package com.techlab.demo;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Base and Exponent");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 1;
		if (b == 0)
			System.out.println("1");
		else if(b>0){
			while (b != 0) {
				ans *= a;
				b--;
			}
			System.out.println("Power of number is : "+ans);
		}
		else
		{
			double a1=1.0;
		//	System.out.println("Power of number is : "+a1);
			while(b!=0)
			{
				a1=a1/a;
				//System.out.println("Power of number is : "+a1);
				b++;
			}
			System.out.println("Power of number is : "+a1);
		}
	
	}

}
