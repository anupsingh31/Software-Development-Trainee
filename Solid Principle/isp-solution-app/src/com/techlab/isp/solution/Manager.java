package com.techlab.isp.solution;

public class Manager implements IWorkEat{

	@Override
	public void startWork() {
		System.out.println("Manager has Started Work");
		
	}

	@Override
	public void stoptWork() {
		System.out.println("Manager has Stoped Work");
		
	}

	@Override
	public void startEat() {
		System.out.println("Manager is Eating");
		
	}

	@Override
	public void stopEat() {
		System.out.println("Manager has stoped eat");
		
	}

}
