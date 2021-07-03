/*Write a Java program to find duplicate values of an array.
[10,56,78,100,78,57,01,10]*/


package com.techlab.assignment.test;

public class ArrayDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,56,78,100,78,57,01,10};
		int n=arr.length;
		System.out.print("Duplicate value in Array is : ");
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
					break;
				}
			}
		}
	}

}
