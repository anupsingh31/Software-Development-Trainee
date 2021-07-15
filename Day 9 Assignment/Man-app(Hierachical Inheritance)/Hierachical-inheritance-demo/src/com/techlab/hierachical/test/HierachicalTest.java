package com.techlab.hierachical.test;

import com.techlab.hierachical.Boy;
import com.techlab.hierachical.Infant;
import com.techlab.hierachical.Kid;
import com.techlab.hierachical.Man;

public class HierachicalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Animal a=new Animal(); a.Eat();
		 * 
		 * Dog d=new Dog(); d.Bark(); d.Eat();
		 * 
		 * Cat c= new Cat(); c.Meow(); c.Eat();
		 */
		Man mobj = new Man();
		mobj.eat();
		mobj.play();

		Boy bobj = new Boy();
		bobj.eat();
		bobj.play();
		bobj.read();

		Kid kobj = new Kid();
		kobj.eat();
		kobj.play();
		
		Infant iobj=new Infant();
		iobj.eat();
		iobj.play();
		
		
		System.out.println("********************");
		case1();
		case2();
		case3();
		
		atThePark(new Man());
		atThePark(new Boy()); 
		atThePark(new Infant());
		atThePark(new Kid());
	cas4();
	}
	public static void case1() {
	 Man x= new Man();
	 x.eat();
	 x.play();
	}
	public static void case2() {
		 Boy y= new Boy();
		 y.eat();
		 y.play();
		 y.read();
		}
	public static void case3() {
		 Man x= new Boy();
		 x.eat();
		 x.play();
		
		}
	public static void atThePark(Man x)
	{
		System.out.println("At the park");
		x.eat();
		x.play();
	}
public static void cas4() {
		Object x;
		x=10;
		System.out.println(x.getClass());
		x="hello";
		System.out.println(x.getClass());
		x=new Man();
		System.out.println(x.getClass());
	}
}
