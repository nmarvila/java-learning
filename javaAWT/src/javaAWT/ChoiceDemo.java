package javaAWT;

import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener {
	Choice os, browser;
	String msg = "";
	
	ChoiceDemo() {
		setLayout(new FlowLayout());
		
		os = new Choice();
		browser = new Choice();
		
		os.add("Windows");
		os.add("Android");
		os.add("Linux");
		os.add("Mac OS");
		
		browser.add("Edge");
		browser.add("Firefox");
		browser.add("Chrome");
		
		add(os);
		add(browser);
		
		os.addItemListener(this);
		browser.addItemListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	
	public void itemStateChanged(ItemEvent ie) {
		repaint();
	}
	
	public void paint(Graphics g) {
		msg = "Current OS: ";
		msg += os.getSelectedItem();
		g.drawString(msg, 20, 120);
		msg = "Current Browser: ";
		msg += browser.getSelectedItem();
		g.drawString(msg, 20, 140);
	}
	
	public static void main(String[] args) {
		ChoiceDemo appwin = new ChoiceDemo();
		
		appwin.setSize(new Dimension(240, 180));
		appwin.setTitle("ChoiceDemo");
		appwin.setVisible(true);
	}
}
