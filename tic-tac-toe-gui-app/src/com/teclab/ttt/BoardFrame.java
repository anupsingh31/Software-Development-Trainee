package com.teclab.ttt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class BoardFrame extends JFrame{
	private String player1;
	private String player2;
	private JLabel l1,l2;
	
	
	public BoardFrame(String player1, String player2) {
		this.player1=player1;
		this.player2=player2;
		getBoardFrame();
	}
	
	public void getBoardFrame() {
		setTitle("Tic Tac Toe");
		setSize(350, 400);
		l1=new JLabel();
		l1.setText(this.player1);
		//JPanel jp=new JPanel();
		//jp.setLayout(new GridLayout(0,1));
		//jp.add(l1);
		//add(jp,BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(l1);
        buttonPanel.setLayout( new GridLayout(4, 3) );
        
        add(buttonPanel, BorderLayout.CENTER);
        BoadListner bl=new BoadListner(this);
		for (int i = 1; i < 10; i++)
        {
            String text = String.valueOf(i);
            JButton button = new JButton( text );
            
            button.addActionListener( bl );
            button.setBorder( (Border) new LineBorder(Color.BLACK) );
            button.setPreferredSize( new Dimension(50, 50) );
            buttonPanel.add( button );

           // InputMap inputMap = button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
            //inputMap.put(KeyStroke.getKeyStroke(text), text);
           // inputMap.put(KeyStroke.getKeyStroke("NUMPAD" + text), text);
            //button.getActionMap().put(text, numberAction);
        }
		setVisible(true);
	}

}
