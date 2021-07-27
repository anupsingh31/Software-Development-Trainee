package com.techlab.simple.factory.pattern;

public class Tesla implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Tesla is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Tesla has stopped");
		
	}

}
