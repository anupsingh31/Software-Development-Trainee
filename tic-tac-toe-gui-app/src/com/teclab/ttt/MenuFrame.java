package com.teclab.ttt;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton b1;  
    private JPanel jPanel;  
    private JLabel l1, l2;  
    public JTextField  textField1,textField2;
	 
    
    public MenuFrame() {
    	setTitle("Tic Tac Toe");
		setSize(350, 400);
		l1=new JLabel("Player1 Name : ");
		
		textField1=new JTextField(15);
		l2=new JLabel("Player2 Name : ");
		
		textField2=new JTextField(15);
		b1=new JButton("Start");
		
		jPanel = new JPanel(new GridLayout(3, 1));
		MenuListner ml=new MenuListner(this);
		jPanel.add(l1);
		jPanel.add(textField1);
		jPanel.add(l2);
		jPanel.add(textField2);
		jPanel.add(b1);
		add(jPanel, BorderLayout.CENTER);
		setVisible(true);
		b1.addActionListener(ml);
		
    }

}
