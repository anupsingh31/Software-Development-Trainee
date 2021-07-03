/* Write program for following using substring 
Input:- " https://www.swabhavtech.com@
java?abc";
Output:-
Company name:- swabhav tech
Lang:- java
Intern name:- abc( mention your name */



package com.techlab.assignment.test;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="https://www.swabhavtech.com@java?Anupamkumar";
		System.out.println("Company name : "+input.substring(input.indexOf('.')+1,input.lastIndexOf('.')));
		System.out.println("Lang : "+input.substring(input.indexOf('@')+1,input.indexOf('?')));
		System.out.println("Intern name : "+input.substring(input.indexOf('?')+1,input.length()));
		
	}

}
