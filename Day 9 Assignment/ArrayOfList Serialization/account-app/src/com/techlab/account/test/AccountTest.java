package com.techlab.account.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Account[] a=new Account[4];
		 a[0] = new Account(1000, "anupam", 5000.0);
		System.out.println(
				"accountNo = " + a[0].getAccNo() + " accountName = " + a[0].getAccName() + " balance = " + a[0].getBalance());
		a[0].Deposite(100);
		System.out.println("balance = " + a[0].getBalance());
		a[0].withDraw(2000);
		printInfo(a[0]);

		a[1] = new Account(1001, "atul", 3000.0);
		System.out.println(
				"accountNo = " + a[1].getAccNo() + " accountName = " + a[1].getAccName() + " balance = " + a[1].getBalance());
		a[1].Deposite(2000);
		System.out.println("balance = " + a[1].getBalance());
		a[1].withDraw(4000);
		printInfo(a[1]);
		
		a[2] = new Account(1002, "aakash", 15000);
		a[3] = new Account(1003, "rahul", 8000);
		
		storingAccountDetails(a);
		retriveAccountDetails(a);
		
	}

	public static void printInfo(Account a) {
		System.out.println("\n Transtion done by  " + a.getAccName());

		if (!a.getTransactionStatus()) {
			System.err.println("Insufficient Balance  ");
			System.out.println("Current Balance : " + a.getBalance());
		} else {
			System.out.println("Current Balance : " + a.getBalance());
		}

	}

	private static void storingAccountDetails(Account[] a) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"src/AccountDetails.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(a);
			//out.flush();
			out.close();
			fout.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private static Account[] retriveAccountDetails(Account[] retriveAccount) {
		try {
			
			FileInputStream fout = new FileInputStream("src/AccountDetails.txt");
            ObjectInputStream out = new ObjectInputStream(fout);
			retriveAccount = (Account[]) out.readObject();
			out.close();
			fout.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		for (Account employee : retriveAccount) {
            System.out.println(employee);
		}
		return retriveAccount;
	}
}
