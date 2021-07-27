package com.techlab.proxy.pattern.test;

import com.techlab.proxy.pattern.Image;
import com.techlab.proxy.pattern.ProxyImage;

public class ProxyPatternTest {

	public static void main(String[] args) {

		Image image = new ProxyImage("car.zpg");
		image.display();
		
		System.out.println("");

		image.display();

	}

}
