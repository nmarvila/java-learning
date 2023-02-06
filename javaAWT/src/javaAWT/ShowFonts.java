package javaAWT;

import java.awt.event.*;
import java.awt.*;

public class ShowFonts extends Frame {
	String msg = "First five fonts: ";
	GraphicsEnvironment ge;
	
	public ShowFonts() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		String[] fontList = ge.getAvailableFontFamilyNames();
		
		for(int i=0; (i < 5) && (i < fontList.length); i++)
			msg += fontList[i] + " ";
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, 10, 60);
	}
	
	public static void main(String[] args) {
		ShowFonts appwin = new ShowFonts();
		
		appwin.setSize(new Dimension(500, 100));
		appwin.setTitle("ShowFonts");
		appwin.setVisible(true);
	}
}
