package com.techlab.interfaces;

public class InvoiceDb implements Icrudable {

	@Override
	public void Create() {
		// TODO Auto-generated method stub
		System.out.println("Invoicer Database Created");

	}

	@Override
	public void Read() {
		// TODO Auto-generated method stub
		System.out.println("Invoicer Database Readble");
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println("Invoicer Database Updated");
	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub
		System.out.println("Invoicer Database Deleted");
	}

}
