package com.techlab.observer.pattern.test;

import com.techlab.observer.pattern.BinaryObserver;
import com.techlab.observer.pattern.HexaObserver;
import com.techlab.observer.pattern.OctalObserver;
import com.techlab.observer.pattern.Subject;

public class ObserverPatternTest {

	public static void main(String[] args) {
		Subject subject = new Subject();
		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);

		System.out.println("First state change 15 ");
		subject.setState(15);
		System.out.println("\nSecond state chenge to 10");
		subject.setState(10);

	}

}
