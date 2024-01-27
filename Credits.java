package Panels;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Util.*;
import Main.*;


public class Credits extends JPanel implements ActionListener{

	private Buttons backbt = new Buttons("Back");
	private JLabel creditslb = new JLabel("   Credits");
	private PanelWang backbtpanel = new PanelWang();
	private PanelWang creditspanel = new PanelWang();
	private RunAwayMain frame;
	
	public Credits(RunAwayMain frame) {
		this.frame=frame;
		this.setLayout(new GridLayout(1,3));
		this.setBackground(Colors.pink2);
		this.add(creditspanel);
		this.add(backbtpanel);
		this.add(new PanelWang());

		creditspanel.setLayout(new GridLayout(9,1));
		creditspanel.add(new PanelWang());
		creditspanel.add(creditslb);
		
		creditslb.setFont(Fonts.font_topic);
		creditslb.setForeground(Color.WHITE);
		
		backbtpanel.setLayout(new GridLayout(9,1));
		backbtpanel.add(new PanelWang());
		backbtpanel.add(new PanelWang());
		backbtpanel.add(new PanelWang());
		backbtpanel.add(new PanelWang());
		backbtpanel.add(new PanelWang());
		backbtpanel.add(new PanelWang());
		backbtpanel.add(new PanelWang());
		backbtpanel.add(backbt);
		
		backbt.addActionListener(this);
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(Fonts.font_radiobutton);
		g.setColor(Color.WHITE);
		g.drawString("This game is a part of DES103 final project", 240,200);
		g.drawString("Game design by Kanyarat Monklung (ID: 6422771194)", 203, 230);
		g.drawString("Sirindhorn Institute of Technology, Thammasat University", 196, 260);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backbt) {
			frame.mainPanel();

		}
		
	}
	
	
}
