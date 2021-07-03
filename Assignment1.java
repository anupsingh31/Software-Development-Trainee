package com.techlab.assignment.test;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3, y=5,z=10;
		
		// case 1:-
		int r1 = ++z + y - y + z + x;// z=11 + y=5 - y=5 + z=11 + x=3 =25
		System.out.println("Case 1 result: " + r1);
		
		// case 2 :- z = 11, x = 3, y = 5;
		int r2 = ++z + y - y + z + x++;  // z=12 + y=5 - y=5 + z=12 + x=3 =27, now x=4;
		System.out.println("case 2 result : " + r2);
		
		// case 3 :- x=4, y=5, z=12
		int r3 = ++z + y - y + z + ++x; // z=13 + y=5 - y=5 + z=13 + x=5 = 31
		System.out.println("case 3 result : " + r3);
		
		// case 4 :- z=13, y=5, x=5
		int r4 = ++z + ++y - y + z + ++x; //z=14 + y=6 - y=6 + z=14 + x=6 = 34
		System.out.println("case 4 result  : "+ r4);
		
		// case 5 :- z=14, y= 6 , x=6
		int r5 = ++z + ++y - y + z + ++x;
		System.out.println("case 5 result  : "+ r5);
		
		// case 6 :- z=15, y= 7 , x=7
		int r6 = ++z + ++y - y++ + z + ++x;//z=16 + y=8 - y=8 + z=16 + x=8 = 40, now y=9
		System.out.println("case 6 result  : "+ r6);
		
		// case 7 :- z=16, y=9 , x=8
			int r7 = --z + y + y-- + z;//z=15 + y=9 + y=9 + z=15 = 48, now y=8
			System.out.println("case 7 result  : "+ r7);
			
		// case 7 :- z=15, y=8 , x=8
			int r8 = --z + y + y-- + z + x--;//z=14 + y=8 + y=8 + z=14 + x=8 = 52, now y=7, x=7
			System.out.println("case 8 result  : "+ r8);	
	}

}
