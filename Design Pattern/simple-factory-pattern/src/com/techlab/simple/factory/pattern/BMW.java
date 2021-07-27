package com.techlab.simple.factory.pattern;

public class BMW implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMW is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW has stopped");
		
	}

}
