/* Write a java program to find all pairs of elements in an integer array whose sum is equal to a given number?Input Array : [4, 6, 5, -10, 8, 5, 20]
Input Number : 10
Pairs of elements whose sum is 10 are :
4 + 6 = 10
5 + 5 = 10
-10 + 20 = 10

*/


package com.techlab.assignment.test;

import java.util.*;

public class ArrayPairElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4, 6, 5, -10, 8, 5, 20};
		int num=10;
		int size=arr.length;
		System.out.println("Pair of Element whose sum is equal to "+num+" is : ");
		
		/*
		Map<Integer , Integer > map = new Hashtable<>() ;
	    for (int i = 0 ; i < size ; i++) {
	        map.put(arr[i], i ) ;
	    }
	    for (int i = 0 ; i < size ; i++) {
	    	if (map.containsKey(num-arr[i]))
	    		System.out.println("( "+ arr[i]+" , "+(num-arr[i])+" )");
	    }
	    
	    */
		Arrays.sort(arr);
		int low=0;
		int high=size-1;
		while (low < high)
		  {
		    if ((arr[low] + arr[high] )== num)
		    {
		    System.out.println("( "+arr[low]+","+arr[high]+")");
		    }
		    if (arr[low] + arr[high] > num)
		    {
		      high--;
		    }
		    else
		    {
		      low++;
		    }
		  }
	    
		/*for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if((arr[i]+arr[j])==num)
				{
					System.out.println("( "+ arr[i]+" , "+arr[j]+" )");
				}
			}
		}*/

	}

}
