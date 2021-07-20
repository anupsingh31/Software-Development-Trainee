package com.techlab.player;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void testPlayer() {
		// Arrange
		int expectedid = 100;
		String expectedname = "anupam";
		int expectedage = 21;

		// Act
		Player pl = new Player(100, "anupam", 21);

		// Assert
		assertEquals(expectedid, pl.getId());
		assertEquals(expectedname, pl.getName());
		assertEquals(expectedage, pl.getAge());

	}

	@Test
	void testWhoISElder() {
		// Arrange
		Player expected = new Player(101, "rahul", 25);

		// Act
		Player p1 = new Player(100, "anupam", 21);
		Player p2 = new Player(101, "rahul", 25);
		Player p3 = p1.whoISElder(p2);

		// Assert
		assertEquals(expected.getId(), p3.getId());
		assertEquals(expected.getName(), p3.getName());
		assertEquals(expected.getAge(), p3.getAge());
	}

}
