package com.techlab.builder.pattern;

public class MealBuilder {
	public Meal prepareVegMill()
	{
		Meal meal=new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal preparenonVegMeal()
	{
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
