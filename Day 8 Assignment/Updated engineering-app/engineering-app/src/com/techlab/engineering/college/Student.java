package com.techlab.engineering.college;

public class Student extends Person {
	private String branch;

	public Student(int id, String address, String dob) {
		super(id, address, dob);

	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}
}
