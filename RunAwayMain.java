package Main;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

import Panels.*;
import Util.*;

public class RunAwayMain extends JFrame implements ActionListener, ItemListener, KeyListener{
	
	public static JFrame frame = new JFrame("Run Away");
	private JLabel title = new JLabel("Run Away!");
	
	private Buttons playbt = new Buttons("Play");
	private Buttons creditbt = new Buttons("Credits");
	
	private PanelWang playpanel = new PanelWang();
	private PanelWang speedpanel = new PanelWang();
	private JPanel mainpanel = new JPanel();
	
	private Labels speed = new Labels("Game Speed");
	private RadioButtons normal = new RadioButtons("Normal");
	private RadioButtons fast = new RadioButtons("Fast");
	
	public static CardLayout cardLayout;
	public static JPanel cardPanel;
	public static Game game;
	public static GameOver gameover;
	public static Ball ball;
	public static Barrier barrier;
	
	public RunAwayMain() {
		
		title.setFont(Fonts.font_topic);
		title.setForeground(Color.WHITE);
		
		playpanel.setLayout(new GridLayout(11,1));
		playpanel.add(new PanelWang());
		playpanel.add(new PanelWang());
		playpanel.add(new PanelWang());
		playpanel.add(title);
		playpanel.add(new PanelWang());
		playpanel.add(playbt);
		playpanel.add(new PanelWang());
		playpanel.add(creditbt);
		playpanel.add(new PanelWang());
		playpanel.add(new PanelWang());
		
		speedpanel.setLayout(new GridLayout(9,1));
		speedpanel.add(new PanelWang());
		speedpanel.add(new PanelWang());
		speedpanel.add(new PanelWang());
		speedpanel.add(speed);
		speedpanel.add(normal);
		speedpanel.add(fast);
		
		mainpanel.setBackground(Colors.pink2);
		mainpanel.setLayout(new GridLayout(1,4));
		mainpanel.add(new PanelWang());
		mainpanel.add(playpanel);
		mainpanel.add(new PanelWang());
		mainpanel.add(speedpanel);
		
		normal.addItemListener(this);
		normal.setSelected(true);
		fast.addItemListener(this);
		
		playbt.addActionListener(this);
		creditbt.addActionListener(this);
		
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		
		cardPanel.add(mainpanel,"main");
		
		game = new Game(this);
		cardPanel.add(game,"game");
		cardPanel.add(new Credits(this),"credits");
		cardPanel.add(new GameOver(this), "gameover");
		
		frame.addKeyListener(this);
		frame.setFocusable(true); 
		
		frame.setSize(800,550);
		frame.add(cardPanel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getSource() == normal && e.getStateChange() == 1) {
			Ball.fps = 300;
			Barrier.speed = 13;
			fast.setSelected(false);
			System.out.println("normal chosen");
			
		}
		
		if(e.getSource() == fast && e.getStateChange() == 1) {
			Ball.fps = 200;
			Barrier.speed = 17;
			normal.setSelected(false);
			System.out.println("fast chosen");
		}
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == playbt) {
			cardLayout.show(cardPanel,"game");
			
			game.barrier1.move(game);
			game.barrier2.move(game);
			game.barrier3.move(game);
			
			System.out.println("play clicked");
			
		}
		
		if(e.getSource() == creditbt) {
			cardLayout.show(cardPanel,"credits");
			System.out.println("credits clicked");
			
			}

		}
		
		public static void mainPanel() {
			cardLayout.show(cardPanel,"main");
			System.out.println("back clicked");
		}
		
		public static void gameOver() {
			cardLayout.show(cardPanel,"gameover");
			System.out.println("the game is over");
			
		}
		
		public static void gamePanel() {
			cardLayout.show(cardPanel, "game");
			
			/*game.barrier1.move(game);
			game.barrier2.move(game);
			game.barrier3.move(game);*/
			
			System.out.println("play clicked");
			

		}
		
		public static void exit() {
			frame.dispose();
		}

		@Override
		public void keyTyped(KeyEvent e) {
			if (cardPanel.getComponent(1).isVisible()) {
				game.charPanel.keyTyped(e);
			}
	
		}


		@Override
		public void keyPressed(KeyEvent e) {
			if (cardPanel.getComponent(1).isVisible()) {
				game.charPanel.keyPressed(e);
			}
			
		}


		@Override
		public void keyReleased(KeyEvent e) {
			if (cardPanel.getComponent(1).isVisible()) {
				game.charPanel.keyReleased(e);
			}
			
		}

}
