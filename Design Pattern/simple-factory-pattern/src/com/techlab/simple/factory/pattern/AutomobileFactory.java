package com.techlab.simple.factory.pattern;

public class AutomobileFactory {
	public IAutoMobile make(AutoType type) {
		if (type == AutoType.AUDI) {
			return new Audi();
		}
		if (type == AutoType.BMW) {
			return new BMW();
		}
		return new Tesla();

	}

}
