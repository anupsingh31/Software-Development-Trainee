package com.techlab.candidate;

public class Candidate {
	private int id;
	private String name;
	private int age;
	private String creditpoint;

	public Candidate(int id, String name, int age, String creditpoint) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.creditpoint = creditpoint;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCreditPoint() {
		return creditpoint;
	}

	public void whoISBetter(Candidate[] c) {
		String s = c[0].getCreditPoint().toString();
		int temp = Integer.parseInt(s);
		for (int i = 1; i < c.length; i++) {
			
			String s1 = c[1].getCreditPoint().toString();
			int temp1 = Integer.parseInt(s1);
			if (temp < temp1)
				temp = temp1;

			// System.out.println("Best creditpoint is "+s1);
		}
		System.out.println("Best creditpoint is " + temp);
		
	}
}
