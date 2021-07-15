package com.techlab.iemotinable.test;

import com.techlab.iemotinable.Boy;
import com.techlab.iemotinable.IEmotionable;
import com.techlab.iemotinable.ISocializable;
import com.techlab.iemotinable.Man;

public class IEmotionableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man m = new Man();
		Boy b = new Boy();
		printInfo(m);
		printInfo(b);
	}

	public static void printInfo(IEmotionable s) {

		try {
			((ISocializable) s).depart();
		} catch (Exception m) {
			System.err.println(m);
		}
		try {
			((ISocializable) s).wish();
		} catch (Exception m) {
			System.err.println(m);
		}
		s.cry();
		s.laugh();
	}
}
