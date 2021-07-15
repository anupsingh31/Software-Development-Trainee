package com.techlab.engineering.college;

public class Professor extends Person {

	private double BasicSalary;
	private double DearnessAllowance;
	private double HRAAllowance;
	private double conveyance;
	private double medicalAllowance;

	public Professor(int id, String name, String dob) {
		super(id, name, dob);

	}

	public void setSalary(double BasicSalary, double DearnessAllowance, double HRAAllowance, double conveyance,
			double medicalAllowance) {
		this.BasicSalary = BasicSalary;
		this.DearnessAllowance = DearnessAllowance;
		this.HRAAllowance = HRAAllowance;
		this.conveyance = conveyance;
		this.medicalAllowance = medicalAllowance;
	}

	public double getSalary() {
		return BasicSalary + DearnessAllowance + HRAAllowance + conveyance + medicalAllowance;
	}

}
