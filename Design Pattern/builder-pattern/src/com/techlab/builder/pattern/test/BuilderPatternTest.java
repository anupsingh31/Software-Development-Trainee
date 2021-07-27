package com.techlab.builder.pattern.test;

import com.techlab.builder.pattern.Meal;
import com.techlab.builder.pattern.MealBuilder;

public class BuilderPatternTest {

	public static void main(String[] args) {
		MealBuilder mealbuilder = new MealBuilder();
		Meal vegMeal = mealbuilder.prepareVegMill();
		System.out.println("veg meal :  ");
		vegMeal.ShowItem();
		System.out.println("Total Cost : " + vegMeal.getCost());

		Meal nonvegMeal = mealbuilder.preparenonVegMeal();
		System.out.println("\n\n non veg meal : ");
		nonvegMeal.ShowItem();
		System.out.println("Total Cost : " + nonvegMeal.getCost());

	}

}
