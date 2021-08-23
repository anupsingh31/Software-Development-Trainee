package com.teclab.ttt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuListner implements ActionListener{
	private MenuFrame menuFrame;
	private String player1;
	private String player2;

	public MenuListner(MenuFrame menuFrame) {
		this.menuFrame=menuFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		player1 = menuFrame.textField1.getText();        
        player2 = menuFrame.textField2.getText();
		BoardFrame boardFrame=new BoardFrame(player1,player2);
	}

}
