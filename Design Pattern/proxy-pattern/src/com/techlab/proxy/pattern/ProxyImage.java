package com.techlab.proxy.pattern;

public class ProxyImage implements Image {

	private RealImage realimage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realimage == null) {
			realimage = new RealImage(fileName);
		}
		realimage.display();

	}

}
