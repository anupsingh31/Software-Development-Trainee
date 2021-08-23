package com.teclab.ttt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoadListner implements ActionListener{
	private BoardFrame boardFrame;

	public BoadListner(BoardFrame boardFrame) {
		this.boardFrame=boardFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println();
		
	}

}
