package javaAWT;

import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Frame implements ActionListener {
	List os, browser;
	String msg = "";
	
	public ListDemo() {
		setLayout(new FlowLayout());
		
		os = new List(4, true);
		
		browser = new List(4);
		
		os.add("Windows");
		os.add("Android");
		os.add("Linux");
		os.add("Mac OS");
		
		browser.add("Edge");
		browser.add("Firefox");
		browser.add("Chrome");
		
		browser.select(1);
		os.select(0);
		
		add(os);
		add(browser);
		
		os.addActionListener(this);
		browser.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent ae) {
		repaint();
	}
	
	public void paint(Graphics g) {
		int[] idx;
		
		msg = "Current OS: ";
		idx = os.getSelectedIndexes();
		for(int i=0; i<idx.length; i++)
			msg += os.getItem(idx[i]) + "  ";
		g.drawString(msg, 20, 120);
		msg = "Current Browser: ";
		msg += browser.getSelectedItem();
		g.drawString(msg, 20, 140);
	}
	
	public static void main(String[] args) {
		ListDemo appwin = new ListDemo();
		
		appwin.setSize(new Dimension(300, 180));
		appwin.setTitle("ListDemo");
		appwin.setVisible(true);
	}
}
