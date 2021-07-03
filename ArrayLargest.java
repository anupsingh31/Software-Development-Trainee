package com.techlab.assignment.test;

public class ArrayLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,56,78,100,34,57};
		int n=arr.length;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("First Largest Element is : "+arr[n-1]);
		System.out.println("First Largest Element is : "+arr[n-2]);
				}

}
