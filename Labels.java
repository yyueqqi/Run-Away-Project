package Util;

import java.awt.Color;

import javax.swing.JLabel;

public class Labels extends JLabel {
	
	public Labels() {
		this("");
	}
	public Labels(String text){
		super(text);
		this.setForeground(Color.WHITE);
		this.setFont(Fonts.font_subtopic);
	}

}
