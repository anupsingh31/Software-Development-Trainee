package com.techlab.person;

public class Person {
	private String name;
	private int age;
	private Gender gender;
	private float height;
	private float weight;

	public Person(String name, int age, Gender gender, float height, float weight) {
		if (name == null || name == "")
			this.name = "unspecified";
		else
			this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public Person(String name, Gender gender, float height, float weight) {
		if (name == null || name == "")
			this.name = "unspecified";
		else
			this.name = name;
		this.age = 25;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
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

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public void doWorkOut() {
		this.weight = weight - (weight * 0.2f);

	}

	public void doEat() {
		this.weight = weight + (weight * 0.05f);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + ", weight="
				+ weight + "]";
	}
}
