package com.techlab.assignment.test;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="https://www.swabhavtech.com@java?Anupamkumar";
		System.out.println("Company name : "+input.substring(12,23));
		System.out.println("Lang : "+input.substring(input.indexOf('@')+1,input.indexOf('?')));
		System.out.println("Intern name : "+input.substring(input.indexOf('?')+1,input.length()));
		
	}

}
