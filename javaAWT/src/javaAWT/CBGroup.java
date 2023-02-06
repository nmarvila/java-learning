package javaAWT;

import java.awt.*;
import java.awt.event.*;

public class CBGroup extends Frame implements ItemListener {
	String msg = "";
	Checkbox windows, android, linux, mac;
	CheckboxGroup cbg;
	
	public CBGroup() {
		setLayout(new FlowLayout());
		
		cbg = new CheckboxGroup();
		
		windows = new Checkbox("Windows", cbg, true);
		android = new Checkbox("Android", cbg, false);
		linux = new Checkbox("Linux", cbg, false);
		mac = new Checkbox("Mac OS", cbg, false);
		
		add(windows);
		add(android);
		add(linux);
		add(mac);
		
		windows.addItemListener(this);
		android.addItemListener(this);
		linux.addItemListener(this);
		mac.addItemListener(this);
		
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
		msg = "Current selection: ";
		msg += cbg.getSelectedCheckbox().getLabel();
		g.drawString(msg, 20, 120);
	}
	
	public static void main(String[] args) {
		CBGroup appwin = new CBGroup();
		
		appwin.setSize(new Dimension(240, 180));
		appwin.setTitle("CBGroup");
		appwin.setVisible(true);
	}
}
