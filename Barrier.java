package Panels;

import Util.*;

import Main.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Timer;

public class Barrier extends PanelWang{
	public Ball ball;
	Barrier barrier;
	public int x,y,w,h;
	public static int speed;
	PanelWang Game;
	
	public Barrier(int x, int y, int w, int h, PanelWang Game, Ball ball) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.ball = ball;
		this.Game = Game;
		
	}
	
	public void move(PanelWang Game) {
		Timer timer = new Timer(25, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Random rand = new Random();
				x -= speed;
	
				if(x<0){ 
					int rv = rand.nextInt(75);
					double rw = rv; //Implicit casting
					
				     x = 1000;
				     y = (int) Math.round(205 - rw); //Explicit casting
				     h = (int) Math.round(70 + rw);
				     ball.score+=1;
				     
				     System.out.println(ball.score);
				     
				    }
				
					if ( ((ball.x <= x+2 && ball.x >= x-2) && ball.y >= y) || ball.hit ) {
						 ((Timer)e.getSource()).stop();
						 ball.hit = true;
						 RunAwayMain.gameOver();
						 
						 }
					
				Game.repaint();		
			}
			
		});

			timer.start();

	}
	

}

