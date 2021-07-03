package com.techlab.assignment.test;

public class ArrayEvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,04,13,06,15};
		int j=-1;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				j++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int i :arr)
		{
			System.out.print(i+" ");
		}
	}

}
