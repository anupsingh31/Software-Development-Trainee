package com.techlab.singleton.pattern.test;

import com.techlab.singleton.pattern.DataService;

public class DataServiceTest {

	public static void main(String[] args) {
		DataService s1 = DataService.getInstance();
		DataService s2 = DataService.getInstance();

		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());

		s1.processData();
		s2.processData();

	}

}
