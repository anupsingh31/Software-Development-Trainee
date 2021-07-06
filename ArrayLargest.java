/* Write a Java program to find the largest and second largest value of an array.
[10,56,78,100,34,57] */


package com.techlab.assignment.test;

public class ArrayLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,56,78,100,34,57};
		int n=arr.length;
		int firstlarge=arr[0];
		int secondlarge=arr[1];
		if(firstlarge<secondlarge)
		{
			int temp=firstlarge;
			firstlarge=secondlarge;
			secondlarge=temp;
		}
		for(int i=2;i<n;i++)
		{
			if(arr[i]>firstlarge)
			{
				secondlarge=firstlarge;
				firstlarge=arr[i];
			}
			else if(arr[i]>secondlarge)
				secondlarge=arr[i];
		}
		System.out.println("First Largest Element is : "+firstlarge);
		System.out.println("First Largest Element is : "+secondlarge);
				}

}
