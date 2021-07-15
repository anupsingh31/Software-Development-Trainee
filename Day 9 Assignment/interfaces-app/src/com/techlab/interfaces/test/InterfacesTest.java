package com.techlab.interfaces.test;

import com.techlab.interfaces.AddressDb;
import com.techlab.interfaces.CustomerDb;
import com.techlab.interfaces.Icrudable;
import com.techlab.interfaces.InvoiceDb;

public class InterfacesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressDb adb = new AddressDb();
		CustomerDb cdb = new CustomerDb();
		InvoiceDb idb = new InvoiceDb();

		printInfo(adb);
		// Icrudable a=adb;
		printInfo(cdb);
		printInfo(idb);
	}

	public static void printInfo(Icrudable c) {
		c.Create();
		c.Delete();
		c.Update();
		c.Read();
	}
}
