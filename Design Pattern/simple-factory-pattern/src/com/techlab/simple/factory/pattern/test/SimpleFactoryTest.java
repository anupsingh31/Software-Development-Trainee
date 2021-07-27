package com.techlab.simple.factory.pattern.test;

import com.techlab.simple.factory.pattern.AutoType;
import com.techlab.simple.factory.pattern.AutomobileFactory;
import com.techlab.simple.factory.pattern.IAutoMobile;

public class SimpleFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutomobileFactory factory= new AutomobileFactory();
		IAutoMobile bmw=factory.make(AutoType.BMW);
		bmw.start();
		bmw.stop();
		
		IAutoMobile audi = factory.make(AutoType.AUDI);
		audi.start();
		audi.stop();
		
		IAutoMobile tesla = factory.make(AutoType.TESLA);
		tesla.start();
		tesla.stop();
	}

}
