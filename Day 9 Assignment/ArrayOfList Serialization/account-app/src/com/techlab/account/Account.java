package com.techlab.account;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Account implements Serializable{
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + ", transactionStatus="
				+ transactionStatus + "]";
	}

	private int accNo;
	private String accName;
	private double balance;
	private static double MIN_AMOUNT = 500.0;
	private boolean transactionStatus = true;

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

	public void Deposite(double amount) {
		balance += amount;
	}

	public boolean getTransactionStatus() {
		return transactionStatus;
	}

	public void withDraw(double amount) {
		if ((balance - amount) < MIN_AMOUNT) {
			transactionStatus = false;
		} else
		{
			balance -= amount;
		transactionStatus = true;
		}
	}

}
