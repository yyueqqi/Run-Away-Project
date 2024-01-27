package Panels;

import Util.*;


import java.awt.*;
import java.awt.event.*;

import javax.swing.Timer;

public class Ball extends PanelWang{
	public int x,y,ballSize;
	private int jump = 120;
	public static int fps;
	public boolean hit;
	public static int score = 0;
	
	public Ball(int x, int y, int ballSize) {
		this.x = x;
		this.y = y;
		this.ballSize = ballSize;   
		hit = false;
	}
	
	public void jump(PanelWang Char) {
		this.y -= jump;
		Char.repaint();
		
		Timer timer = new Timer(fps, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				y += jump;
				Char.repaint();
				
			}
			
		});
		
		timer.setRepeats(false);
		timer.start();
	}
	
}

