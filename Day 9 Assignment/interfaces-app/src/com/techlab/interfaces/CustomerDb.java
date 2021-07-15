package com.techlab.interfaces;

public class CustomerDb implements Icrudable {

	@Override
	public void Create() {
		// TODO Auto-generated method stub
		System.out.println("Customer Database Created");

	}

	@Override
	public void Read() {
		// TODO Auto-generated method stub
		System.out.println("Customer Database Readble");
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		System.out.println("Customer Database Updated");
	}

	@Override
	public void Delete() {
		// TODO Auto-generated method stub
		System.out.println("Customer Database Deleted");
	}

}
