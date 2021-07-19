package com.techlab.collection.test;

import java.util.ArrayList;

import com.techlab.collection.LineItem;

public class LineItemTest {
	private static double TotalAmount=0.0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(101, "Apple", 30.0, 10));
		cart.add(new LineItem(102, "Manjo", 20.0, 5));
		cart.add(new LineItem(103, "ToothPaste", 85.0, 2));
		printCartItem(cart);
	}

	public static void printCartItem(ArrayList<LineItem> cart) {
		for (int i = 0; i < cart.size(); i++) {
			System.out.println("Id " + cart.get(i).getId() + " Name " + cart.get(i).getName() + " UnitPrice "
					+ cart.get(i).getUnitPrice() + " Quantity " + cart.get(i).getQuantity() + " TotalPrice "
					+ cart.get(i).calculateTotalCartPrice());
			TotalAmount+=cart.get(i).calculateTotalCartPrice();
			// System.out.println(cart.get(i).toString());

		}
		System.out.println("Total :  "+TotalAmount);
	}
}
