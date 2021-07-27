package com.techlab.observer.pattern;

public class BinaryObserver extends Observer {

	// protected Subject subject;
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String : " + Integer.toBinaryString(subject.getState()));

	}

}
