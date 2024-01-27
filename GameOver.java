package Panels;

import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

import Main.RunAwayMain;

import Util.*;

import Main.*;

public class GameOver extends JPanel implements ActionListener{
	private PanelWang btpanel = new PanelWang();
	private Buttons exitbt = new Buttons("Exit");
	public RunAwayMain frame;
	public Char charPanel = new Char();
	public Game game;
	public Ball ball;
	
	public GameOver(RunAwayMain frame) {
		this.frame = frame;
		this.setLayout(new GridLayout(1,3));
		this.setBackground(Colors.pink2);
		
		btpanel.setLayout(new GridLayout(11,1));
		btpanel.add(new PanelWang());
		btpanel.add(new PanelWang());
		btpanel.add(new PanelWang());
		btpanel.add(new PanelWang());
		btpanel.add(new PanelWang());
		btpanel.add(new PanelWang());
		btpanel.add(exitbt);
		btpanel.add(new PanelWang());
		btpanel.add(new PanelWang());  
		btpanel.add(new PanelWang());
		
		this.add(new PanelWang());
		this.add(btpanel);
		this.add(new PanelWang());

		exitbt.addActionListener(this);
		
	}
	

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.white);
		g.setFont(new Font(Font.MONOSPACED,Font.BOLD, 50));
		g.drawString("Game Over!", 240, 210);
		
		g.setColor(Color.WHITE);
		g.setFont(Fonts.font_subtopic);
		g.drawString("Your score: " + String.valueOf(charPanel.ball.score), 310, 250);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exitbt) {
			System.out.println("exit clicked");
			Exit exit = new Exit();
			exit.setVisible(true);
		}
	}
	
}
