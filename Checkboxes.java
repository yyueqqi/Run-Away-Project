package Util;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class Checkboxes extends JCheckBox{
	
	public Checkboxes(String text) {
		super(text);
		this.setFocusPainted(false);
		this.setOpaque(false);
		this.setForeground(Color.WHITE);
		this.setFont(Fonts.font_radiobutton);
	}

}