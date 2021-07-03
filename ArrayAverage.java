/* Write a Java program to calculate the average value of array elements
[01,11,24,23,15]*/



package com.techlab.assignment.test;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {01,11,24,23,15};
		int sum=0;
		int n=arr.length;
		for(int i : arr)
		{
			sum += i;
		}
		float ans=(float)sum/n;
		System.out.println("Average value of Array Elements : "+ans);
	}

}
