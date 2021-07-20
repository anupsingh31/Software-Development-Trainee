package com.techlab.osp.solution;

public class FixedDeposite {
	private int accNo;
	private String accName;
	private double amount;
	private double principle;
	private int year;
	private IFestivalRate festName;

	public FixedDeposite(int accNo, String accName, double amount, double principle, int year, IFestivalRate festName) {
		this.accNo = accNo;
		this.accName = accName;
		this.amount = amount;
		this.principle = principle;
		this.year = year;
		this.festName = festName;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getAmount() {
		return amount;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYear() {
		return year;
	}

	public IFestivalRate getFestival() {
		return festName;
	}

	public double calculateSimpleInterest() {
		double si = (principle * year * festName.getRate()) / 100;
		return si;
	}

	@Override
	public String toString() {
		return "FixedDeposite [accNo=" + accNo + ", accName=" + accName + ", amount=" + amount + ", principle="
				+ principle + ", year=" + year + ", festName=" + festName.getRate() + ",  calculateSimpleInterest="
				+ calculateSimpleInterest() + "]";
	}

}
