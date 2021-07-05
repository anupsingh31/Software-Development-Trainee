//Program to find palindrome number using function ...create one function outside main...write your logic there and call it inside main 


package com.techlab.assignment.test;

public class PalindromeFunctionTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int n = 1213121;
		if (palindrome(n))
			System.out.println("Palindeome Number");
		else
			System.out.println("Not Palindrome Number");
	}

	public static boolean palindrome(int a) {
		int copy = a;
		int temp = 0;
		while (a != 0) {
			temp = temp * 10 + a % 10;
			a = a / 10;
		}
		if (copy == temp)
			return true;
		else
			return false;
	}
}
