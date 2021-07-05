/* Write a program to count nos occurence in array using method 
Suppose array :-[2 5 4 2 7 4 2]
Output:- 
2 is repeating thrice ,4 twice and others once */


package com.techlab.assignment.test;

import java.util.Arrays;

public class OccurenceNumberFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 5, 4, 2, 7, 4, 2};
		int n=arr.length;
		occurence(arr,n);
	}
	public static void occurence(int arr[], int n)
	{
		boolean visited[]=new boolean[n];
		Arrays.fill(visited, false);
		for(int i=0;i<n;i++)
		{
			if(visited[i]==true)
			continue;
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					visited[j]=true;
				}
			}
			System.out.println(arr[i]+" : "+count);
		}
	}
}
