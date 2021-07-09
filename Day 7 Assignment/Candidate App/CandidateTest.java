package com.techlab.candidate.test;

import com.techlab.candidate.Candidate;
public class CandidateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate[] c = new Candidate[4];
		Candidate c1 = new Candidate(1, "Anupam", 20, "35000");
		c[0] = c1;
		Candidate c2 = new Candidate(2, "Amit", 21, "4000");
		c[1] = c2;
		Candidate c3 = new Candidate(3, "sumit", 20, "30000");
		c[2] = c3;
		Candidate c4 = new Candidate(4, "ankit", 22, "25000");
		c[3] = c4;
		
		c1.whoISBetter(c);
		printCandidateInfo(c);
		
	}

	public static void printCandidateInfo(Candidate[] info) {
		for (int i = 0; i < info.length; i++) {
			System.out.println("ID of " + (i + 1) + " Employee is : " + info[i].getId());
			System.out.println("Name of " + (i + 1) + " Employee is : " + info[i].getName());
			System.out.println("CreditPoint of " + (i + 1) + " Employee is : " + info[i].getCreditPoint());
		}
	}


}
