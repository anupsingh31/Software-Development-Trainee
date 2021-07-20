package com.techlab.dip.solution;

public class TXTLogger implements ILog {

	@Override
	public void log(String errorMessage) {
		System.out.println("writing data in TXT file ...... \n" + errorMessage);

	}

}
