package events.InnerClass;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerClassDemo extends Frame {
	String msg = "";
	
	public InnerClassDemo() {
		addMouseListener(new MyMouseAdapter());
		addWindowListener(new MyWindowAdapter());
	}
	
	class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent me) {
			msg = "Mouse Pressed.";
			repaint();
		}
	}
	
	class MyWindowAdapter extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, 20, 80);
	}
	
	public static void main(String[] args) {
		InnerClassDemo appwin = new InnerClassDemo();
		
		appwin.setSize(new Dimension(200, 150));
		appwin.setTitle("InnerClassDemo");
		appwin.setVisible(true);
	}
}
