package com.techlab.person.test;

import com.techlab.person.Gender;
import com.techlab.person.NewPerson;

public class NewPersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewPerson np = new NewPerson("Anupam", 21, Gender.Male, 58, 5.6f);
		NewPerson np1 = new NewPerson("Ankita", 28, Gender.Female, 45, 5.2f);
		System.out.println(np.toString());
		System.out.println(np1.toString());
	}

}
