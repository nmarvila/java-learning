package events.InnerClass;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;

public class MousePressedDemo extends Frame {
	String msg = "";
	
	public MousePressedDemo() {
		addMouseListener(new MyMouseAdapter(this));
		addWindowListener(new MyWindowAdapter());
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, 20, 100);
	}
	
	public static void main(String[] args) {
		MousePressedDemo appwin = new MousePressedDemo();
		
		appwin.setSize(new Dimension(200, 150));
		appwin.setTitle("MousePressedDemo");
		appwin.setVisible(true);
	}
}
