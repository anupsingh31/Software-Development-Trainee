package com.techlab.player.test;

import com.techlab.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] p = new Player[4];
		p[0] = new Player(1, "Anupam", 21);

		 p[1] = new Player(2, "Amit", 18);
		 p[2] = new Player(3, "sumit", 29);
		 p[3] = new Player(4, "ankit", 40);
		 Player p1=new Player(0, "", 0);
		 for (int i = 0; i < p.length; i++) {
				System.out.println("ID of " + (i + 1) + " Player is : " + p[i].getId());
				System.out.println("Name of " + (i + 1) + " Player is : " + p[i].getName());
				System.out.println("Age of " + (i + 1) + " Player is : " + p[i].getAge());
				p1 = p1.whoISElder(p[i]);
				System.out.println("Highest Age of Player is " + p1.getAge());
			}
		
	}

	public static void printPlayerInfo(Player[] info) {
		for (int i = 0; i < info.length; i++) {
			System.out.println("ID of " + (i + 1) + " Player is : " + info[i].getId());
			System.out.println("Name of " + (i + 1) + " Player is : " + info[i].getName());
			System.out.println("Age of " + (i + 1) + " Player is : " + info[i].getAge());
			info[0] = info[0].whoISElder(info[i]);
			System.out.println("Highest Age of Player is " + info[i].getAge());
		}
	}
}
