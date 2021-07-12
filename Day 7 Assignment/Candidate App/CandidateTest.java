package com.techlab.candidate.test;

import com.techlab.candidate.Candidate;

public class CandidateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate[] c = new Candidate[4];

		c[0] = new Candidate(1, "Anupam", 20, "45000");
		c[1] = new Candidate(2, "Amit", 21, "4000");
		c[2] = new Candidate(3, "sumit", 20, "50000");
		c[3] = new Candidate(4, "ankit", 22, "35000");
		Candidate temp=new Candidate(0,"",0,"");

		for (int i = 0; i < c.length; i++) {
			System.out.println("ID of " + (i + 1) + " Employee is : " + c[i].getId());
			System.out.println("Name of " + (i + 1) + " Employee is : " + c[i].getName());
			System.out.println("CreditPoint of " + (i + 1) + " Employee is : " + c[i].getCreditPoint());
			//temp = temp.whoISBetter(c[i]);

		}
		System.out.println("Best Candidate is  whose id = " + temp.getId() + " Name = " + temp.getName() + " CreditPoint = "
				+ temp.getCreditPoint());

	}

}
