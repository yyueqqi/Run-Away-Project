package Util;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class Buttons extends JButton {
	
	public Buttons() {
		this("");
	}
	
	public Buttons(String title) {
		super(title);
		this.setFocusPainted(false);
		this.setBackground(Colors.yellow2);
		this.setForeground(Colors.red2);
		this.setFont(Fonts.font_button);
	}
		

}
