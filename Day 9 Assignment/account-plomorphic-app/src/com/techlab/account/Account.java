package com.techlab.account;

public abstract class Account {
	private int accNo;
	private String accName;
	private double balance;

	public Account(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;

	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double remBalance) {
		balance = remBalance;
	}

	public void Deposite(double amount) {
		balance += amount;
	}

	public abstract void withDraw(double amount);
}
