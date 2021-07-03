//Write a Java program to sum values of an array.[10,02,01,15,22]

package com.techlab.assignment.test;

public class ArraySumValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 02, 01, 15, 22 };
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println("Sum of Values of Array is  :"+sum);
	}

}
