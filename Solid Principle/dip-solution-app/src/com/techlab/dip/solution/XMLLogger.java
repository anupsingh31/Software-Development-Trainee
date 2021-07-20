package com.techlab.dip.solution;

public class XMLLogger implements ILog {

	@Override
	public void log(String errorMessage) {
		System.out.println("writing data in XML file ...... \n" + errorMessage);

	}

}
