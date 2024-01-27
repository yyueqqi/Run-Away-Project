package Panels;

import javax.swing.*;


import Util.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Char extends PanelWang {
	public Ball ball = new Ball(50,235,40);
	Barrier barrier;
	public int c_score = this.ball.score;
	
	
	public Char() {
		
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		c_score = this.ball.score;
		
		if (c_score%10 <= 4) {
		g.setColor(Colors.yellow2);
		g.fillOval(ball.x, ball.y, ball.ballSize, ball.ballSize);
		
		}
		
		else if (c_score%10 < 10 && c_score%10 >= 5) {
			g.setColor(Colors.pink2);
			g.fillOval(ball.x, ball.y, ball.ballSize, ball.ballSize);
		}
		
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	
	public void keyPressed(KeyEvent e) {
		
		if (e.getKeyCode() == 32) {
			if(!ball.hit) {
				ball.jump(this);
			}
		}
		
	}
		
	public void keyReleased(KeyEvent e) {
		
	}
	
}


