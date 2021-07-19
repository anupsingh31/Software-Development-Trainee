package com.techlab.person.test;

import com.techlab.person.Gender;
import com.techlab.person.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Anupam", 21, Gender.Male, 5.6f, 61.0f);
		System.out.println(p.toString());
		p.doWorkOut();
		System.out.println(p.toString());
		p.doEat();
		System.out.println(p.toString());
		Person p1 = new Person("Anupam", Gender.Male, 5.6f, 61.0f);
		System.out.println(p1.toString());

	}

}
