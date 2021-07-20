package com.techlab.dip.solution;

public class JSONLogger implements ILog {
	public void log(String ErrorMessage) {
		System.out.println("writing data in JSON file ...... \n" + ErrorMessage);
	}

}
