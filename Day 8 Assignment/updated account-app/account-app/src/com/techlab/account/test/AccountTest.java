package com.techlab.account.test;

import com.techlab.account.Account;

public class AccountTest {
	private static final double MIN_AMOUNT = 500;
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Account a = new Account(1000, "anupam", 5000.0);
		System.out.println(
				"accountNo = " + a.getAccNo() + " accountName = " + a.getAccName() + " balance = " + a.getBalance());
		a.Deposite(100);
		System.out.println("balance = " + a.getBalance());
		withDraw(a,2000);
		System.out.println("remaning balane : " + a.getBalance());
		withDraw(a,3000);
		System.out.println("remaning balane : " + a.getBalance());
		
		Account b = new Account(1001, "atul", 3000.0);
		System.out.println(
				"accountNo = " + b.getAccNo() + " accountName = " + b.getAccName() + " balance = " + b.getBalance());
		b.Deposite(2000);
		System.out.println("balance = " + b.getBalance());
		withDraw(b,4000);
		System.out.println("remaning balance : " + b.getBalance());
		withDraw(b,3000);
		System.out.println("remaning balance : " + b.getBalance());
		withDraw(b,1000);
		System.out.println("remaning balance : " + a.getBalance());
		withDraw(a,500);
	}
	public static void withDraw(Account a,double amount)
	{
		double balance=a.getBalance();
		if(balance-amount<MIN_AMOUNT) {
			System.out.println("Insufficient Balance,Minimum balance should be "+MIN_AMOUNT+" but it is  "+(balance-amount));
		}
		else
		{
			a.setBalance(balance-amount);
		}
			
		
	}
}
