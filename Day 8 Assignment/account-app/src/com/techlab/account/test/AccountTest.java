package com.techlab.account.test;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Account a=new Account(1000, "anupam", 5000.0);
		System.out.println("accountNo = "+a.getAccNo()+" accountName = "+a.getAccName()+" balance = "+a.getBalance());
		a.Deposite(100);
		System.out.println("balance = "+a.getBalance());
		a.withDraw(2000);
		System.out.println("remaning balane : "+a.getBalance());
		a.withDraw(3000);
		System.out.println("remaning balane : "+a.getBalance());
		Account b=new Account(1001, "atul", 3000.0);
		System.out.println("accountNo = "+b.getAccNo()+" accountName = "+b.getAccName()+" balance = "+b.getBalance());
		b.Deposite(2000);
		System.out.println("balance = "+b.getBalance());
		b.withDraw(4000);
		System.out.println("remaning balane : "+b.getBalance());
		b.withDraw(3000);
		System.out.println("remaning balane : "+b.getBalance());
		a.withDraw(1000);
		System.out.println("remaning balane : "+a.getBalance());
	}

}
