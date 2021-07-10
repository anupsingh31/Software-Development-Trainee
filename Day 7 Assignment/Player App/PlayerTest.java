package com.techlab.player.test;

import com.techlab.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] p = new Player[4];
		Player p1 = new Player(1, "Anupam", 20);
		p[0] = p1;
		p[0].whoISElder(p1);
		Player p2 = new Player(2, "Amit", 21);
		p[1] = p2;
		p[0].whoISElder(p2);
		Player p3 = new Player(3, "sumit", 20);
		p[2] = p3;
		p[0].whoISElder(p3);
		Player p4 = new Player(4, "ankit", 22);
		p[3] = p4;
		p[0].whoISElder(p4);
		printPlayerInfo(p);
	}
	public static void printPlayerInfo(Player[] info) {
		for (int i = 0; i < info.length; i++) {
			System.out.println("ID of " + (i + 1) + " Player is : " + info[i].getId());
			System.out.println("Name of " + (i + 1) + " Player is : " + info[i].getName());
			System.out.println("Age of " + (i + 1) + " Player is : " + info[i].getAge());
		}
	}
}
