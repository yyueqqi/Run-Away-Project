package Main;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

import Util.*;

public class Exit extends JPanel implements ItemListener{
	JFrame exitframe = new JFrame("Run Away");
	JPanel exitpn = new JPanel();
	Labels exit = new Labels("Have fun?");
	PanelWang funpn = new PanelWang();
	PanelWang checkpn = new PanelWang();
	Checkboxes yes = new Checkboxes("Yes");
	Checkboxes no = new Checkboxes("No");
	
	public Exit() {
		exitpn.setBackground(Colors.pink2);
		exitpn.setLayout(new GridLayout(4,1));
		checkpn.setLayout(new GridLayout(1,4));
		
		funpn.setLayout(new GridLayout(1,3));
		funpn.add(new PanelWang());
		funpn.add(exit);
		funpn.add(new PanelWang());
		
		checkpn.add(new PanelWang());
		checkpn.add(yes);
		checkpn.add(no);
		checkpn.add(new PanelWang());
		
		exitpn.add(new PanelWang());
		exitpn.add(funpn);
		exitpn.add(checkpn);
		exitpn.add(new PanelWang());

		
		yes.addItemListener(this);
		no.addItemListener(this);
		
		exitframe.add(exitpn);
		exitframe.setSize(400, 180);
		exitframe.setLocationRelativeTo(null);
		exitframe.setVisible(true);
		exitframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		exitframe.setResizable(false);
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.white);
		g.setFont(new Font(Font.MONOSPACED,Font.BOLD, 50));
		g.drawString("Do you have fun?", 600, 100);
		repaint();
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == yes && e.getStateChange() == 1) {
			exitframe.dispose();
			RunAwayMain.exit();
			System.out.println("yes clicked");
			
		}
		
		if (e.getSource() == no && e.getStateChange() == 1) {
			exitframe.dispose();
			RunAwayMain.exit();
			System.out.println("no clicked");
			
		}
		
	}

}
