package com.techlab.dip.solution.test;

import com.techlab.dip.solution.JSONLogger;
import com.techlab.dip.solution.TXTLogger;
import com.techlab.dip.solution.TaxCalculator;
import com.techlab.dip.solution.XMLLogger;

public class DipTest {

	public static void main(String[] args) {
		TaxCalculator calc = new TaxCalculator(new JSONLogger());
		System.out.println(calc.calculateTax(15, 5));
		System.out.println(calc.calculateTax(0, 0));

		TaxCalculator calc1 = new TaxCalculator(new XMLLogger());
		System.out.println(calc1.calculateTax(25, 5));
		System.out.println(calc1.calculateTax(0, 8));

		TaxCalculator calc2 = new TaxCalculator(new TXTLogger());
		System.out.println(calc2.calculateTax(36, 6));
		System.out.println(calc2.calculateTax(9, 0));

	}

}
