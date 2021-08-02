package com.techlab.tic.tac.toe;

public class Player {
	private String playerName;
	private Mark assignMark;
	
	public Player(String playerName, Mark assignMark) {
		this.playerName=playerName;
		this.assignMark=assignMark;
	}
	
	public String getPlayerName() {
		return this.playerName;
		
	}
	
	public void setPlayerName(String name) {
		this.playerName=name;
	}
	 
	public Mark getAssignMark() {
		return this.assignMark;
	}
	
	public void setAssignMark(Mark mark) {
		this.assignMark=mark;
	}

}
