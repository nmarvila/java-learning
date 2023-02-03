package events.InnerClass;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyMouseAdapter extends MouseAdapter {
	MousePressedDemo mousePressedDemo;
	
	public MyMouseAdapter(MousePressedDemo mousePressedDemo) {
		this.mousePressedDemo = mousePressedDemo;
	}
	
	public void mousePressed(MouseEvent me) {
		mousePressedDemo.msg = "Mouse Pressed";
		mousePressedDemo.repaint();
	}
}
