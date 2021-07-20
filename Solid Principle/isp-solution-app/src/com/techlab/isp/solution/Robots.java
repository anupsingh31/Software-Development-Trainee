package com.techlab.isp.solution;

public class Robots implements IWork{

	@Override
	public void startWork() {
		System.out.println("Robert has satarted work");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robert has stoped work");
		
	}

}
