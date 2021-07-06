/* create new class ArrayEvenOddTest.java...............create an array [12,04,13,06,15] ...write a logic to segregate even and odd nos and print it on console seperately*/



package com.techlab.assignment.test;

public class ArrayEvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,04,13,06,15};
		int n=arr.length;
		System.out.print("Even Number is : ");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println(" ");
		System.out.print("Odd Number is : ");
		for(int i :arr)
		{
			if(i%2!=0)
				
			System.out.print(i+" ");
		}
	}

}
