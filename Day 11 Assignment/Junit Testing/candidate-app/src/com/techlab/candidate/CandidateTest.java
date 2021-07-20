package com.techlab.candidate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CandidateTest {

	@Test
	void testCandidate() {
		//Arrange
		int expectedid=101;
		String expectedname="anupam";
		int expectedage=21;
		String expectedcreditpoint="1235";
		//Act
		Candidate cdd=new Candidate(101,"anupam",21,"1235");
		//Assert
		assertEquals(expectedid,cdd.getId());
		assertEquals(expectedname,cdd.getName());
		assertEquals(expectedage,cdd.getAge());
		assertEquals(expectedcreditpoint,cdd.getCreditPoint());
	}

	@Test
	void testWhoISBetter() {
		//Arrange
		Candidate expected=new Candidate(101,"anupam",21,"3550");
		
		//Act
		Candidate c1=new Candidate(101,"anupam",21,"3550");
		Candidate c2=new Candidate(102,"rahul",23,"1835");
		Candidate c3=c1.whoISBetter(c2);
		
		//Assert
		assertEquals(expected.getId(),c3.getId());
		assertEquals(expected.getName(),c3.getName());
		assertEquals(expected.getAge(),c3.getAge());
		assertEquals(expected.getCreditPoint(),c3.getCreditPoint());
	}

}
