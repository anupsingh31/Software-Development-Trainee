package com.techlab.composite.pattern.test;

import com.techlab.composite.pattern.Employee;

public class CompositePatternTest {
	public static void main(String args[]) {

		Employee CEO = new Employee("anupam", "CEO", 1000000);

		Employee headSales = new Employee("Ravi", "Head Sales", 500000);

		Employee HeadMarketing = new Employee("Punit", "Head Marketing", 500000);

		Employee cleark1 = new Employee("Riya", "Marketing", 200000);
		Employee cleark2 = new Employee("Ankit", "Marketing", 200000);

		Employee salesExecutives1 = new Employee("Jaydeep", "Sales", 100000);
		Employee salesExecutives2 = new Employee("Bhashker", "Sales", 100000);

		CEO.add(headSales);
		CEO.add(HeadMarketing);

		headSales.add(salesExecutives1);
		headSales.add(salesExecutives2);

		HeadMarketing.add(cleark1);
		HeadMarketing.add(cleark2);

		System.out.println(CEO);

		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);

			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println("\n" + employee);
			}
		}
	}

}
