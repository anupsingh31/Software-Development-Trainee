package com.techlab.srp.test;

import com.techlab.srp.Invoice;
import com.techlab.srp.InvoiceConsolePrinter;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice iv = new Invoice(1001, "Rice", 1200.0, 5.0);
		InvoiceConsolePrinter print = new InvoiceConsolePrinter(iv);
		print.Print();

	}

}
