package com.techlab.person;

public class NewPerson {
	private String name;
	private int age;
	private Gender gender;
	private double weight;
	private float height;

	public NewPerson(String name, int age, Gender gender, double weight, float height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public double getWeight() {
		return weight;
	}

	public float getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", age=" + age + ", gender=" + gender + ", weight=" + weight + ", height="
				+ height + "]";
	}
}
