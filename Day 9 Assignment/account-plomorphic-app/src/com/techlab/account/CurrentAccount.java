package com.techlab.account;

public class CurrentAccount extends Account {
	private final double MIN_AMOUNT = 500;

	public CurrentAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);

	}

	@Override
	public void withDraw(double amount) {

		if ((getBalance() - amount) < MIN_AMOUNT) {
			System.err.println("Insufficient Balance");

		} else {
			setBalance(getBalance() - amount);

		}

	}

}
