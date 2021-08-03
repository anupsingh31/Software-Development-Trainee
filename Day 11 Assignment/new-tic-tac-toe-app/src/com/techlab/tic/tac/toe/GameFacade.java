package com.techlab.tic.tac.toe;

import java.util.ArrayList;

public class GameFacade {

	private Board board;
	private ResultAnalayzer analyze;
	private Player player;
	private ArrayList<Player> playerData;
	private Result status = Result.INPROGRESS;
	private int numFilledBoardData = 0;
	private Game game;
	private int positionofBoard;

	public GameFacade(int size) {
		board = new Board(size);
		analyze = new ResultAnalayzer(board);
		playerData = new ArrayList<Player>();
		// player=playerData;
		game = new Game(playerData, board, analyze);
	}

	public Result getStatus() {
		return this.status;
	}

	public int getnumFilledBoardData() {
		return this.numFilledBoardData;
	}

	public boolean setnumFilledBoardData(int count) {
		this.numFilledBoardData = count;
		game.Play(count, this.positionofBoard);
		if (analyze.getMoves() + 1 == count) {
			this.numFilledBoardData = analyze.getMoves();
			return true;
		} else {
			this.status = game.getStatus();
			if (this.status != Result.INPROGRESS)
				this.numFilledBoardData += -1;
			return false;
		}
	}

	public ArrayList<Player> getPlayerListData() {
		return this.playerData;
	}

	public void setPlayerData(String playerName, Mark mark) {
		playerData.add(new Player(playerName, mark));
	}

	public String getPlayerName() {
		if (numFilledBoardData % 2 == 0) {
			player = playerData.get(0);
		} else {
			player = playerData.get(1);
		}
		return player.getPlayerName();
	}

	public void setPositionOfBoard(int positionofBoard) {
		this.positionofBoard = positionofBoard;
	}

}
