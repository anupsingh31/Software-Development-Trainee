package com.techlab.srp;

public class InvoiceConsolePrinter {
	private Invoice invoice;

	public InvoiceConsolePrinter(Invoice invoice) {
		this.invoice = invoice;
	}

	public void Print() {
		System.out.println("Invoice no: " + invoice.getNo());
		System.out.println("Invoice Discription: " + invoice.getDescription());
		System.out.println("Cost  : " + invoice.getCost());
		System.out.println("Discount  : " + invoice.getDiscount());
		System.out.println("Discount is Rs: " + invoice.calculateDiscount());
		System.out.println("Tax is Rs: " + invoice.calculateTax());
		System.out.println("Final cost is: " + invoice.calculateFinalCost());
	}
}
