package com.techlab.player;

public class Player {

	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Player whoISElder(Player p) {

		if (this.age < p.age)
			return p;
		else {

			return this;
		}

	}

}
