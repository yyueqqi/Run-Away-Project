package Panels;

import java.awt.*;


import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import javax.swing.*;

import Main.*;

import Util.*;

public class Game extends PanelWang {
	
	private RunAwayMain frame;
	public Char charPanel = new Char();
	public Ball ball;
	public static int fps;
	public int c_score = charPanel.ball.score;
	
	public Barrier barrier1 = new Barrier(1000, 205, 25, 70, this, charPanel.ball);
	public Barrier barrier2 = new Barrier(1300, 205, 25, 70, this, charPanel.ball);
	public Barrier barrier3 = new Barrier(1600, 205, 25, 70, this, charPanel.ball);
	
	
	public Game(RunAwayMain frame) {
		this.frame=frame;
		this.add(charPanel);
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		c_score = charPanel.ball.score;
		
		if (c_score%10 <= 4) {
		
	    g.setColor(Colors.pink2);
		g.fillRect(0, 0, 800, 550);
		
		g.setColor(Colors.yellow2);
		g.drawRect(0, 275, 800, 255);
		
		g.setColor(Colors.yellow2);
		g.fillRect(barrier1.x, barrier1.y, barrier1.w, barrier1.h);
		g.fillRect(barrier2.x, barrier2.y, barrier2.w, barrier2.h);
		g.fillRect(barrier3.x, barrier3.y, barrier3.w, barrier3.h);
		
		g.setColor(Color.WHITE);
		g.setFont(Fonts.font_subtopic);
		g.drawString("Score: " + String.valueOf(charPanel.ball.score), 650, 50);
		
		}
		
		else if (c_score%10 <= 10 && c_score >= 5) {
			
			    g.setColor(Colors.yellow2);
				g.fillRect(0, 0, 800, 550);
				
				g.setColor(Colors.pink2);
				g.drawRect(0, 275, 800, 255);
				
				g.setColor(Colors.pink2);
				g.fillRect(barrier1.x, barrier1.y, barrier1.w, barrier1.h);
				g.fillRect(barrier2.x, barrier2.y, barrier2.w, barrier2.h);
				g.fillRect(barrier3.x, barrier3.y, barrier3.w, barrier3.h);
				g.setColor(Colors.red2);
				g.setFont(Fonts.font_subtopic);
				g.drawString("Score: " + String.valueOf(charPanel.ball.score), 650, 50);
				c_score = 0;
			
		}
	
	}

}