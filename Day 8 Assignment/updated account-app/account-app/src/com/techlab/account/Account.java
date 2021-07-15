package com.techlab.account;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	//private final double MIN_AMOUNT=500.0;
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
	
	public void setBalance( double remBalance) {
		balance=remBalance;
	}

	public void Deposite(double amount) {
		balance += amount;
	}

/*	public void withDraw(double amount) {
		if (balance - amount < MIN_AMOUNT) {
			System.out.println("Insufficient Balance remaining");
		} else
			balance -= amount;
	}
*/
}
