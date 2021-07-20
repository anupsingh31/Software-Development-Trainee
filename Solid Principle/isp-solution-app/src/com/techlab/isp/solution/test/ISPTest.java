package com.techlab.isp.solution.test;

import com.techlab.isp.solution.IWork;
import com.techlab.isp.solution.IWorkEat;
import com.techlab.isp.solution.Manager;
import com.techlab.isp.solution.Robots;

public class ISPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		Robots r=new Robots();
		printInfo(m);
		printInfo1(r);
	}
public static void printInfo(IWorkEat obj)
{
	obj.startWork();
	obj.stoptWork();
	obj.startEat();
	obj.stopEat();
}

public static void printInfo1(IWork obj)
{
	obj.startWork();
	obj.stopWork();
}
}
