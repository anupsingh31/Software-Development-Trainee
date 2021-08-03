package com.techlab.tic.tac.toe;

public class Player {

	private String playerName;
	private Mark assignMark;

	public Player(String name, Mark mark) {
		this.playerName = name;
		this.assignMark = mark;
	}

	public String getPlayerName() {
		return this.playerName;
	}

	public Mark getAssignMark() {

		return this.assignMark;

	}

}
