package com.techlab.demo;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for(int i=2;i<=100;i++)
		{
			flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
				
			}
			if(flag)
				System.out.print(i +" ");
			
		}

	}

}
