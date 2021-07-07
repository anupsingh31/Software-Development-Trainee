/* create an command line based application to find avearge and sum of nos you are passing through an array
input:- 12,10,03,04,10,13 */

package com.techlab.assignment.test;

public class CommandLineArgumentArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (String num : args) {
			sum = sum + Integer.parseInt(num);
		}
		System.out.println("Sum of Array Number is : "+sum);
		float Avg=(float)sum/args.length;
		
		System.out.println("Average of Nmuber is : "+Avg);
	}

}
