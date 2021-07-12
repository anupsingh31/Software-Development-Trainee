package com.techlab.player.test;

import com.techlab.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] p = new Player[4];
		Player p1 = new Player(1, "Anupam", 21);
		p[0] = p1;
		Player p2 = new Player(2, "Amit", 18);
		p[1] = p2;
		Player p3 = new Player(3, "sumit", 29);
		p[2] = p3;
		Player p4 = new Player(4, "ankit", 40);
		p[3] = p4;
		printPlayerInfo(p);
	}
	public static void printPlayerInfo(Player[] info) {
		for (int i = 0; i < info.length; i++) {
			System.out.println("ID of " + (i + 1) + " Player is : " + info[i].getId());
			System.out.println("Name of " + (i + 1) + " Player is : " + info[i].getName());
			System.out.println("Age of " + (i + 1) + " Player is : " + info[i].getAge());
			info[0]=info[0].whoISElder(info[i]);
			System.out.println("Highest Age of Player is "+info[i].getAge());
		}
	}
}
